package gui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import info.Lecture;
import info.Student;
import ocsf.Common;
import ocsf.Packet;
import ocsf.SocketCommunication;

public class Event_Control extends SocketCommunication implements Runnable, ActionListener{
   
   private JButton login_btn;
   private JButton cur_btn;
   private JButton sche_btn;
   private JButton mem_btn;
   private JButton change_btn;
   private JButton open_btn;
   private JButton peep_btn;
   private Login_Layout ll;
   private String btn_String;
   private TextField id_field, pass_field;
   private Main_Layout ml;
   private JFrame main_frame;
   private JPanel login_main_panel;
   private JPanel main_main_panel;
   private Current_Menu_Panel current_menu;
   private Schedule_Menu_Panel schedule_menu;
   private boolean check;
   private JPanel change_pane;
   private Info_Change_Dialog icd;
   private Open_Menu_Panel omp;
   private Peep_Menu_Panel peep_menu;
   private Recommand_Menu_Panel recm_menu;
   
   private Student std;
   
   
   public Event_Control() {
      this.check = true;
      this.ll = new Login_Layout();
      this.ml = new Main_Layout();
      this.login_btn = ll.getLoginBtn();
      this.id_field = ll.getUserId();
      this.pass_field = ll.getUserPass();
      this.mem_btn = ll.getMemberBtn();
      
      this.cur_btn = ml.getCurrentBtn();
      this.sche_btn = ml.getScheduleBtn();
      this.peep_btn = ml.getPeepBtn();
      
      login_btn.addActionListener(this);
      mem_btn.addActionListener(this);
      
      try {
         this.sock = new Socket("127.0.0.1", Common.portNum);
         
         boolean result = sock.isConnected();
         if (result) {
            System.out.println("Success");   
         }
         else
            System.err.println("Fail");
      } 
      catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } 
      catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   @Override
   public void actionPerformed(ActionEvent event) {
      // TODO Auto-generated method stub
      btn_String = new String();
      btn_String = event.getActionCommand();
      
      if (btn_String.equals("정보변경")) {
         System.out.println("정보변경");
         icd = new Info_Change_Dialog();
         change_btn = icd.getChange_btn();
         change_btn.addActionListener(this);
      }
      
      if (btn_String.equals("변경하기")) {
         System.out.println("변경하기");
         
         Student usr = new Student(icd.getBefore_id_field().getText(), icd.getBefore_pass_field().getText());
         Packet pkt = new Packet(usr, 0);
         writeToSocket(pkt);
         pkt = readFromSocket();
         
         // 변경하기 성공
         if (pkt.getRequest() != -1) {
            Student std = pkt.getStd();
            std.setID(icd.getChange_id_field().getText());
            std.setPassword(icd.getChange_pass_field().getText());
            
            pkt = new Packet(std, 1);
            writeToSocket(pkt);
            
            icd.setVisible(false);
         }
         // 변경하기 실패
         else {
        	 JOptionPane.showMessageDialog(null, "변경에 실패했습니다.", "변경 실패", JOptionPane.ERROR_MESSAGE);
         }
      }
      
      if (btn_String.equals("수강현황 조회")) {
         System.out.println("수강현황 조회");
         change_pane.remove(1);
         change_pane.add(current_menu.getContentsPanel());
         change_pane.updateUI();
      }
      
      if (btn_String.equals("시간표 관리")) {
         System.out.println("시간표 관리하기");
         change_pane.remove(1);
         change_pane.add(schedule_menu.getSchedulePanel());
         change_pane.updateUI();
      }
      
      if (btn_String.equals("개설강좌 조회")) {
         System.out.println("개설강좌 조회");
         writeToSocket(new Packet(2));
         ArrayList<Lecture> lecList = readFromSocket().getLecList();
         omp = new Open_Menu_Panel(std, lecList);
      }
      
      if (btn_String.equals("  로그인  ")) {
         Student usr = new Student(id_field.getText(), pass_field.getText());
         Packet pkt = new Packet(usr, 0);
         writeToSocket(pkt);
         pkt = readFromSocket();
         
         // 로그인 성공
         if (pkt.getRequest() != -1) {
            System.out.println("로그인 성공");
            std = pkt.getStd();
            ml.setStdInfo(std);
            
            this.current_menu = new Current_Menu_Panel(std);
            this.schedule_menu = new Schedule_Menu_Panel();
            
            open_btn = schedule_menu.getOpenLectureBtn();
            
            
            login_main_panel = ll.getMainPanel();
            main_main_panel = ml.getMainPanel();
            
            //시작은 수강 현황 조회하기로 시작.
            change_pane = ml.getMainPanel();
            change_pane.add(current_menu.getContentsPanel());

            cur_btn.addActionListener(this);
            sche_btn.addActionListener(this);
            id_field.addActionListener(this);
            pass_field.addActionListener(this);
            open_btn.addActionListener(this);
            peep_btn.addActionListener(this);
            current_menu.getGrade().addActionListener(this);
            
            ll.getMainFrame().setVisible(false);
            ml.getMainFrame().setVisible(true);
            check = false;
         }
         // 로그인 실패
         else {
        	 JOptionPane.showMessageDialog(null, "로그인에 실패했습니다.", "로그인 실패", JOptionPane.ERROR_MESSAGE);
         }
      }
      
      if (btn_String.equals("시간표 엿보기")) {
          System.out.println("시간표 엿보기");

          writeToSocket(new Packet(std, 3));
          ArrayList<Lecture> peepLecs = readFromSocket().getLecList();
          this.peep_menu = new Peep_Menu_Panel(peepLecs);
          
          change_pane.remove(1);
          change_pane.add(peep_menu.getContents_Panel());
          change_pane.updateUI();
       }
      
      if (btn_String.equals("강의 추천하기")) {
          System.out.println("강의 추천하기");

          ArrayList<Lecture> lecList = std.getOldLectureList().getLecList();
          recm_menu = new Recommand_Menu_Panel(lecList);
          recm_menu.addWindowListener(new WindowAdapter()
          {
              @Override
              public void windowClosing(WindowEvent e)
              {
            	  writeToSocket(new Packet(recm_menu.getLecList(), 4));
                  e.getWindow().dispose();
              }
          });
       }
   }

   @Override
   public void run() {
      while (check) {
      // TODO Auto-generated method stub
         if (id_field.getText().equals("") || pass_field.getText().equals(""))
            login_btn.setEnabled(false);
         else
            login_btn.setEnabled(true);
         
         try {
            Thread.sleep(100);
         }
         
         catch (Exception e){
            
         }
      }
   }
   
   public Main_Layout getMainLayout() {
      return ml; 
   }

}
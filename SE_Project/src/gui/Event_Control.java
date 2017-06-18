package gui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import info.Student;
import ocsf.Common;
import ocsf.Packet;
import ocsf.SocketCommunication;

public class Event_Control extends SocketCommunication implements Runnable, ActionListener {
	
	private JButton login_btn;
	private JButton cur_btn;
	private JButton sche_btn;
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
	
	
	
	public Event_Control() {
		this.check = true;
		this.ll = new Login_Layout();
		this.ml = new Main_Layout();
		this.login_btn = ll.getLoginBtn();
		this.id_field = ll.getUserId();
		this.pass_field = ll.getUserPass();
		
		this.cur_btn = ml.getCurrentBtn();
		this.sche_btn = ml.getScheduleBtn();
		
		this.current_menu = new Current_Menu_Panel();
		this.schedule_menu = new Schedule_Menu_Panel();
		
		login_main_panel = ll.getMainPanel();
		main_main_panel = ml.getMainPanel();
		
		//시작은 수강 현황 조회하기로 시작.
		change_pane = ml.getMainPanel();
		change_pane.add(current_menu.getContentsPanel());
		
		cur_btn.addActionListener(this);
		sche_btn.addActionListener(this);
		login_btn.addActionListener(this);
		id_field.addActionListener(this);
		pass_field.addActionListener(this);
		
		
		
		try {
			sock = new Socket("127.0.0.1", Common.portNum);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ddddddddd");
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		btn_String = new String();
		btn_String = event.getActionCommand();
		
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
		
		if (btn_String.equals("  로그인  ")) {
			Packet pkt = new Packet(new Student(id_field.getText(), pass_field.getText()));
			writeToSocket(pkt);
			pkt = readFromSocket();
			
			// 로그인 성공
			if (pkt.getRequest() != -1) {
				ml.setStdInfo(pkt.getStd());
				
				ll.getMainFrame().setVisible(false);
				ml.getMainFrame().setVisible(true);
				check = false;
			}
			// 로그인 실패
			else {
				System.out.println("실패");
			}
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

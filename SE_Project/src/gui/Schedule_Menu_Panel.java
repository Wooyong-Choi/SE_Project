package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import info.Lecture;

public class Schedule_Menu_Panel {
   
   
   private JButton open_lecture = new JButton("개설강좌 조회");
   private JPanel schedule_panel;
   private JLabel label = new JLabel("시간표 관리");
   private Font mainfont;
   private JScrollPane scroll;
   private JTable table;
   private DefaultTableModel model;
   private ArrayList<Lecture> fromOpen;
   
   public Schedule_Menu_Panel() {
      String[] header = {"학년", "분류", "과목코드", "강좌명", "학점", "설계", "추천수"};
      mainfont = new Font("main", Font.BOLD, 30);
      
      model = new DefaultTableModel(header, 0);
      
      table = new JTable(model);
      table.getTableHeader().setFont(mainfont);
      table.setFont(mainfont);
      table.setRowHeight(100);
      
      scroll = new JScrollPane(table);
      
      
      schedule_panel = new JPanel(new BorderLayout(15, 15));
      open_lecture.setFont(mainfont);
      open_lecture.setBackground(Color.YELLOW);
      
      schedule_panel.add(open_lecture, BorderLayout.NORTH);
      schedule_panel.add(scroll, BorderLayout.CENTER);
   }
   
   public JPanel getSchedulePanel() {
      return schedule_panel;
   }
   
   public JButton getOpenLectureBtn() {
      return open_lecture;
   }
   
   public JTable getTable() {
      return table;
   }
   
   public DefaultTableModel getModel() {
      return model;
   }
   
   public ArrayList<Lecture> getFromOpen() {
      return fromOpen;
   }

}
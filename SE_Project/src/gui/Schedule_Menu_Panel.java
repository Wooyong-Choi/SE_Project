package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Schedule_Menu_Panel {
   
   
   private JButton open_lecture = new JButton("개설강좌 조회");
   private JPanel schedule_panel;
   private JLabel label = new JLabel("시간표 관리");
   private Font mainfont;
   
   public Schedule_Menu_Panel() {
      mainfont = new Font("main", Font.BOLD, 30);
      
      schedule_panel = new JPanel(new BorderLayout(15, 15));
      open_lecture.setFont(mainfont);
      open_lecture.setBackground(Color.YELLOW);
      schedule_panel.add(open_lecture, BorderLayout.NORTH);
      
   }
   
   public JPanel getSchedulePanel() {
      return schedule_panel;
   }
   
   public JButton getOpenLectureBtn() {
      return open_lecture;
   }

}
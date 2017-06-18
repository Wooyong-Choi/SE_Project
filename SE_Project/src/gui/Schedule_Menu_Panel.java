package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Schedule_Menu_Panel {
	
	private JPanel schedule_panel;
	private JLabel label = new JLabel("시간표 관리");
	private Font mainfont;
	
	public Schedule_Menu_Panel() {
		mainfont = new Font("main", Font.BOLD, 30);
		
		schedule_panel = new JPanel(new BorderLayout(15, 15));
		label.setFont(mainfont);
		schedule_panel.add(label, BorderLayout.NORTH);
		
	}
	
	public JPanel getSchedulePanel() {
		return schedule_panel;
	}

}

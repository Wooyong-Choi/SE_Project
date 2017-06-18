package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import info.Student;

public class Main_Layout {
	
	private Main_Frame mf;
	private JFrame main_frame;
	private JPanel big_Panel;
	private JPanel menu_Panel;
	private JPanel contents_panel;
	private JPanel divide_Layout;
	
	private String nickName;
	private JLabel onUse = new JLabel("메뉴");
	private Font mainFont;
	private JButton current;
	private JButton open;
	private JButton schedule;
	private JButton peep;

	
	private Student stdInfo;

	public Main_Layout() {
		this.current = new JButton("수강현황 조회");
		this.open = new JButton("개설강좌 조회");
		this.schedule = new JButton("시간표 관리");
		this.peep = new JButton("시간표 엿보기");
		
		this.mainFont = new Font("main", Font.BOLD, 30);
		
		this.mf = new Main_Frame();
		main_frame = mf.getMainFrame();
		
		this.big_Panel = new JPanel(new BorderLayout(25, 25));
		main_frame.add(big_Panel);
		
		this.menu_Panel = new JPanel();
		this.contents_panel = new JPanel();
		this.divide_Layout = new JPanel(new FlowLayout());
		
		setMenuPanel(menu_Panel);
		
		big_Panel.add(menu_Panel, BorderLayout.WEST);
	}
	 
	public void setMenuPanel(JPanel menu) {
		menu.setLayout(new GridLayout(5, 1, 8, 8));
		menu.setBackground(Color.WHITE);
		onUse.setFont(mainFont);
		onUse.setHorizontalAlignment(SwingConstants.CENTER);
		
		current.setFont(mainFont);
		current.setBackground(Color.YELLOW);
		
		open.setFont(mainFont);
		open.setBackground(Color.YELLOW);
		
		schedule.setFont(mainFont);
		schedule.setBackground(Color.YELLOW);
		
		peep.setFont(mainFont);
		peep.setBackground(Color.YELLOW);
		
		menu.add(onUse);
		menu.add(current);
		menu.add(open);
		menu.add(schedule);
		menu.add(peep);
		
		
	}
	
	
	public JPanel getMainPanel() {
		return big_Panel;
	}
	
	public JPanel getMenuPanel() {
		return menu_Panel;
	}
	
	public JPanel getContentsPanel() {
		return contents_panel;
	}
	
	public JFrame getMainFrame() {
		return main_frame;
	}
	
	public JButton getCurrentBtn() {
		return current;
	}
	
	public JButton getOpenBtn() {
		return open;
	}
	
	public JButton getScheduleBtn() {
		return schedule;
	}
	
	public JButton getPeepBtn() {
		return peep;
	}

	public Student getStdInfo() {
		return stdInfo;
	}

	public void setStdInfo(Student stdInfo) {
		this.stdInfo = stdInfo;
	}
	
	
}

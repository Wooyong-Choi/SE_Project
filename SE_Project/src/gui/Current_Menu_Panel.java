package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import info.Student;
import info.TimeTable;

public class Current_Menu_Panel {
	private JTable table;
	private JPanel contents_Panel;
	private JButton grade;
	private Font mainFont;
	private JLabel menu_name;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private DefaultTableCellRenderer rend;
	
	public Current_Menu_Panel(Student std) {
		this.rend = new DefaultTableCellRenderer();
		this.menu_name = new JLabel("수강현황 조회");
		this.mainFont = new Font("main", Font.BOLD, 35);
		this.contents_Panel = new JPanel(new BorderLayout(15, 15));
		this.grade = new JButton("강의 추천하기");
		
		TimeTable time = std.getOldLectureList();
		int tCredit = time.calTotalCredit();
		int dCredit = time.calDesignCredit();
		int mCredit = time.calMajorCredit();
		int bCredit = time.calBaseCredit();
		int lCredit = time.calLibArtCredit();
		
		//이부분에 테이블 contents 초기화
		String[] header = {" ", "현재학점", "남은학점", "졸업요건"};
		String[][] contents = {
				{"총 이수학점", tCredit+"", (150-tCredit>0 ? 150-tCredit : 0)+"", "150"},
				{"공학전공"  , mCredit+"", (75-mCredit>0 ? 75-mCredit : 0)+"" ,  "75"},
				{"설계학점"  , dCredit+"", (16-dCredit>0 ? 16-dCredit : 0)+"" ,  "16"},
				{"전공기반"  , bCredit+"", (24-bCredit>0 ? 24-bCredit : 0)+"", "24"},
				{"기본소양"  , lCredit+"", (15-lCredit>0 ? 15-lCredit : 0)+"", "15"}
				};
		
		model = new DefaultTableModel(contents, header);
		this.table = new JTable(model);
		table.setRowHeight(210);
		table.getTableHeader().setFont(mainFont);
		table.setFont(mainFont);
		scroll = new JScrollPane(table);
		scroll.setBackground(Color.CYAN);
		
		grade.setFont(mainFont);
		grade.setBackground(Color.YELLOW);
	
		menu_name.setFont(mainFont);
		menu_name.setHorizontalAlignment(SwingConstants.CENTER);
		
		contents_Panel.setBackground(Color.WHITE);
		
		rend.setHorizontalAlignment(SwingConstants.CENTER);
		
		TableColumnModel cm = table.getColumnModel();
		
		for (int i = 0; i < cm.getColumnCount(); i++) {
			cm.getColumn(i).setCellRenderer(rend);
		}
		
		contents_Panel.add(menu_name, BorderLayout.NORTH);
		contents_Panel.add(scroll, BorderLayout.CENTER);
		contents_Panel.add(grade, BorderLayout.SOUTH);
		
	}
	
	
	
	public JButton getGrade() {
		return grade;
	}



	public void setGrade(JButton grade) {
		this.grade = grade;
	}



	public JTable getTable() {
		return table;
	}
	
	public JPanel getContentsPanel() {
		return contents_Panel;
	}
	
	public JButton getGradeBtn() {
		return grade;
	}

}

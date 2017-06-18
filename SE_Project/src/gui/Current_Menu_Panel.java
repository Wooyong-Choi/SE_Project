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

public class Current_Menu_Panel {
	private JTable table;
	private JPanel contents_Panel;
	private JButton grade;
	private Font mainFont;
	private JLabel menu_name;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private DefaultTableCellRenderer rend;
	
	public Current_Menu_Panel() {
		this.rend = new DefaultTableCellRenderer();
		this.menu_name = new JLabel("������Ȳ ��ȸ");
		this.mainFont = new Font("main", Font.BOLD, 35);
		this.contents_Panel = new JPanel(new BorderLayout(15, 15));
		this.grade = new JButton("���� ��õ�ϱ�");
		
		
		//�̺κп� ���̺� contents �ʱ�ȭ
		String[] header = {" ", "��������", "��������", "�������"};
		String[][] contents = {
				{"�� �̼�����", " ", " ", " "},
				{"��������", " ", " ", " "},
				{"��������", " ", " ", " "},
				{"�������", " ", " ", " "},
				{"�⺻�Ҿ�", " ", " ", " "},
				{"ABEEK �� �̼�����", " ", " ", " "},
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

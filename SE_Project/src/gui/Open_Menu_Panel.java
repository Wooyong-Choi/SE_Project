package gui;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import info.Lecture;
import info.Student;

public class Open_Menu_Panel extends JDialog {
	
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private Font mainfont = new Font("main", Font.BOLD, 30);
	private String[] row_contents;
	
	public Open_Menu_Panel(Student std, ArrayList<Lecture> lec) {
		setTitle("�������� ��ȸ");
		setSize(1500, 1500);
		
		//std.get
		
		String[] header = {"�г�", "�з�", "�����ڵ�", "���¸�", "����", "����", "��õ��"};
		
		model = new DefaultTableModel(header, 0);
		
		table = new JTable(model);
		table.setFont(mainfont);
		
		table.getTableHeader().setFont(mainfont);
		table.setRowHeight(100);
		
		scroll = new JScrollPane(table);
		
		add(scroll);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

}
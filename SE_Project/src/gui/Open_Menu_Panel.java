package gui;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import info.Lecture;
import info.Student;

public class Open_Menu_Panel extends JDialog {
	
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private Font mainfont = new Font("main", Font.BOLD, 30);
	private String[][] row_contents;
	
	public Open_Menu_Panel(Student std, ArrayList<Lecture> lec) {
		setTitle("�������� ��ȸ");
		setSize(2000, 1500);
		
		row_contents = new String[lec.size()][7];
		
		for (int i = 0; i < lec.size(); i++) {
			for (int j = 0; j < 7; j++) {
				
				switch (j) {
				case 0:
					row_contents[i][j] = String.valueOf(lec.get(i).getYear());
					continue;
				case 1:
					row_contents[i][j] = lec.get(i).getKind().toString();
					continue;
				case 2:
					row_contents[i][j] = lec.get(i).getNo();
					continue;
				case 3:
					row_contents[i][j] = lec.get(i).getName();
					System.out.println(row_contents[j]);
					continue;
				case 4:
					row_contents[i][j] = String.valueOf(lec.get(i).getCredit());
					continue;
				case 5:
					if (lec.get(i).isDesign())
						row_contents[i][j] = "����";
					else
						row_contents[i][j] = "";
					continue;
				case 6:
					row_contents[i][j] = String.valueOf(lec.get(i).getStar());
					continue;
				}
				//model = (DefaultTableModel)table.getModel();
				//model.addRow(row_contents);
			}
		}
		
		//std.get
		
		String[] header = {"�г�", "�з�", "�����ڵ�", "���¸�", "����", "����", "��õ��"};
		
		model = new DefaultTableModel(row_contents, header);
		
		table = new JTable(model);
		
		table.setFont(mainfont);
		table.getTableHeader().setFont(mainfont);
		table.setRowHeight(100);
		
		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
		 
		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		 
		// ������ ���̺��� ColumnModel�� ������
		TableColumnModel tcmSchedule = table.getColumnModel();
		 
		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}
		
		scroll = new JScrollPane(table);
		
		add(scroll);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		
	}
}
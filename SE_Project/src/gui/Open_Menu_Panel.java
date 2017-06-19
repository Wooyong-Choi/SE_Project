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
	private String[] row_contents = new String[7];
	
	public Open_Menu_Panel(Student std, ArrayList<Lecture> lec) {
		setTitle("개설강좌 조회");
		setSize(1500, 1500);
		
		//std.get
		
		String[] header = {"학년", "분류", "과목코드", "강좌명", "학점", "설계", "추천수"};
		
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
		
		for (int i = 0; i < lec.size(); i++) {
			for (int j = 0; j < 7; j++) {
				
				switch (j) {
				case 0:
					row_contents[j] = String.valueOf(lec.get(i).getYear());
					continue;
				case 1:
					row_contents[j] = lec.get(i).getKind().toString();
					continue;
				case 2:
					row_contents[j] = lec.get(i).getNo();
					continue;
				case 3:
					row_contents[j] = lec.get(i).getName();
					continue;
				case 4:
					row_contents[j] = String.valueOf(lec.get(i).getCredit());
					continue;
				case 5:
					if (lec.get(i).isDesign())
						row_contents[j] = "설계";
					else
						row_contents[j] = "";
					continue;
				case 6:
					row_contents[j] = String.valueOf(lec.get(i).getStar());
					continue;
				}
				
				model = (DefaultTableModel)table.getModel();
				model.addRow(row_contents);
			}
		}
	}
}
package gui;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
	private Student student;
	private ArrayList<Lecture> pre;
	
	public Open_Menu_Panel(Student std, ArrayList<Lecture> lec) {
		setTitle("개설강좌 조회");
		setSize(2000, 1500);
		
		this.student = std;
		pre = student.getOldLectureList().getLecList();
		row_contents = new String[lec.size()][7];
		
		ArrayList<Lecture> temp = new ArrayList<Lecture>();
		
		for (int i = 0; i < lec.size(); i++) {
			temp.add(lec.get(i));
		}
		
		for (int i = 0; i < pre.size(); i++) {
			for (int j = 0; j < temp.size(); j++) {
				if (pre.get(i).getName().equals(temp.get(j).getName()))
					temp.remove(j);
			}
		}
		
		temp.sort(new Comparator<Lecture>() {

			@Override
			public int compare(Lecture arg0, Lecture arg1) {
				if (arg0.getStar() > arg1.getStar())
					return -1;
				else if (arg0.getStar() == arg1.getStar())
					return 0;
				else
					return 1;
			}
			
		});
		
		for (int i = 0; i < temp.size(); i++) {
			System.out.println(temp.get(i).getName());
		}
		
		for (int i = 0; i < temp.size(); i++) {
			for (int j = 0; j < 7; j++) {
				
				switch (j) {
				case 0:
					row_contents[i][j] = String.valueOf(temp.get(i).getYear());
					continue;
				case 1:
					row_contents[i][j] = temp.get(i).getKind().toString();
					continue;
				case 2:
					row_contents[i][j] = temp.get(i).getNo();
					continue;
				case 3:
					row_contents[i][j] = temp.get(i).getName();
					System.out.println(row_contents[j]);
					continue;
				case 4:
					row_contents[i][j] = String.valueOf(temp.get(i).getCredit());
					continue;
				case 5:
					if (temp.get(i).isDesign())
						row_contents[i][j] = "설계";
					else
						row_contents[i][j] = "";
					continue;
				case 6:
					row_contents[i][j] = String.valueOf(temp.get(i).getStar());
					continue;
				}
				//model = (DefaultTableModel)table.getModel();
				//model.addRow(row_contents);
			}
		}
		
		//std.get
		
		String[] header = {"학년", "분류", "과목코드", "강좌명", "학점", "설계", "추천수"};
		
		model = new DefaultTableModel(row_contents, header);
		
		table = new JTable(model);
		
		table.setFont(mainfont);
		table.getTableHeader().setFont(mainfont);
		table.setRowHeight(100);
		
		
		// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
		 
		// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		 
		// 정렬할 테이블의 ColumnModel을 가져옴
		TableColumnModel tcmSchedule = table.getColumnModel();
		 
		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
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
package gui;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import info.Lecture;

public class Recommand_Menu_Panel extends JDialog {
	
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private Font mainfont = new Font("main", Font.BOLD, 30);
	private String[][] row_contents;
	private ArrayList<Lecture> lecList;
	private boolean[] clickChk;
	
	public Recommand_Menu_Panel(ArrayList<Lecture> lec) {
		setTitle("개설강좌 조회");
		setSize(2000, 1500);
		
		lecList = lec;
		
		
		row_contents = new String[lecList.size()][7];

		clickChk = new boolean[lecList.size()];
		
		for (int i = 0; i < lecList.size(); i++) {
			for (int j = 0; j < 7; j++) {
				
				switch (j) {
				case 0:
					row_contents[i][j] = String.valueOf(lecList.get(i).getYear());
					continue;
				case 1:
					row_contents[i][j] = lecList.get(i).getKind().toString();
					continue;
				case 2:
					row_contents[i][j] = lecList.get(i).getNo();
					continue;
				case 3:
					row_contents[i][j] = lecList.get(i).getName();
					System.out.println(row_contents[j]);
					continue;
				case 4:
					row_contents[i][j] = String.valueOf(lecList.get(i).getCredit());
					continue;
				case 5:
					if (lecList.get(i).isDesign())
						row_contents[i][j] = "설계";
					else
						row_contents[i][j] = "";
					continue;
				case 6:
					row_contents[i][j] = String.valueOf(lecList.get(i).getStar());
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

	public ArrayList<Lecture> getLecList() {
		return lecList;
	}

	public void setLecList(ArrayList<Lecture> lecList) {
		this.lecList = lecList;
	}

	public ListSelectionModel getSelectionModel() {
		// TODO Auto-generated method stub
		return table.getSelectionModel();
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public boolean[] getClickChk() {
		return clickChk;
	}

	public void setClickChk(int i) {
		this.clickChk[i] = true;
	}
	
	
}
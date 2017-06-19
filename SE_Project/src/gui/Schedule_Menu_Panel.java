package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import info.Lecture;

public class Schedule_Menu_Panel {


	private JButton open_lecture = new JButton("개설강좌 조회");
	private JPanel schedule_panel;
	private JLabel label = new JLabel("시간표 관리");
	private Font mainfont;
	private JScrollPane scroll;
	private JTable table;
	private DefaultTableModel model;
	private ArrayList<Lecture> fromOpen;

	public Schedule_Menu_Panel() {
		String[] header = {"학년", "분류", "과목코드", "강좌명", "학점", "설계", "추천수"};
		mainfont = new Font("main", Font.BOLD, 30);

		model = new DefaultTableModel(header, 0);

		table = new JTable(model);
		table.getTableHeader().setFont(mainfont);
		table.setFont(mainfont);
		table.setRowHeight(100);

		scroll = new JScrollPane(table);

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

		schedule_panel = new JPanel(new BorderLayout(15, 15));
		open_lecture.setFont(mainfont);
		open_lecture.setBackground(Color.YELLOW);

		schedule_panel.add(open_lecture, BorderLayout.NORTH);
		schedule_panel.add(scroll, BorderLayout.CENTER);
	}

	public JPanel getSchedulePanel() {
		return schedule_panel;
	}

	public JButton getOpenLectureBtn() {
		return open_lecture;
	}

	public JTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public ArrayList<Lecture> getFromOpen() {
		return fromOpen;
	}

}
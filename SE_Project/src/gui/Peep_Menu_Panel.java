package gui;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import info.Lecture;
import javax.swing.JLabel;

public class Peep_Menu_Panel {

	private JPanel contents_Panel;
	
	public Peep_Menu_Panel(ArrayList<Lecture> lecList) {
		contents_Panel = new JPanel(null);
		contents_Panel.setBackground(Color.WHITE);
		
		String lecInfo = "";
		
		for (Lecture lec : lecList) {
			lecInfo += lec.getName() + '\n';
		}
		
		System.out.println("LecInfo : " + lecInfo);
		
		JLabel lblNewLabel = new JLabel("Lecture\n" + lecInfo);
		lblNewLabel.setBounds(10, 10, 100, 200);
		contents_Panel.add(lblNewLabel);
		
	}

	public JPanel getContents_Panel() {
		return contents_Panel;
	}

	public void setContents_Panel(JPanel contents_Panel) {
		this.contents_Panel = contents_Panel;
	}
	
	
}

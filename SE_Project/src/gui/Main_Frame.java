package gui;

import javax.swing.JFrame;

public class Main_Frame extends JFrame {
	JFrame main_frame;
	
	public Main_Frame() {
		this.main_frame = new JFrame("������ ���α׷�");
		main_frame.setSize(3000, 1500);
		main_frame.setResizable(false);
		main_frame.setLocationRelativeTo(null);
		main_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public JFrame getMainFrame() {
		return main_frame;
	}

}

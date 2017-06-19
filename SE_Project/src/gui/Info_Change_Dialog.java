package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Info_Change_Dialog extends JDialog {
	
	private JLabel before_id = new JLabel("기존 아이디");
	private TextField before_id_field = new TextField(20);
	private JLabel before_pass = new JLabel("기존 비밀번호");
	private TextField before_pass_field = new TextField(20);
	
	private JLabel change_id = new JLabel("변경 아이디");
	private TextField change_id_field = new TextField(20);
	private JLabel change_pass = new JLabel("변경 비밀번호");
	private TextField change_pass_field = new TextField(20);
	
	private JButton change_btn = new JButton("변경하기");
	
	private Font mainfont = new Font("main", Font.BOLD, 30);
	
	public Info_Change_Dialog() {
		setTitle("정보 변경하기");
		setSize(500, 520);
		setLayout(new FlowLayout());
		
		
		before_id.setFont(mainfont);
		before_id_field.setFont(mainfont);
		before_pass.setFont(mainfont);
		before_pass_field.setFont(mainfont);
		before_pass_field.setEchoChar('●');
		
		change_id.setFont(mainfont);
		change_id_field.setFont(mainfont);
		change_pass.setFont(mainfont);
		change_pass_field.setFont(mainfont);
		change_pass_field.setEchoChar('●');
		
		change_btn.setFont(mainfont);
		
		add(before_id);
		add(before_id_field);
		add(before_pass);
		add(before_pass_field);
		
		add(change_id);
		add(change_id_field);
		add(change_pass);
		add(change_pass_field);
		
		add(change_btn);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	
	public JLabel getBefore_id() {
		return before_id;
	}

	public void setBefore_id(JLabel before_id) {
		this.before_id = before_id;
	}

	public TextField getBefore_id_field() {
		return before_id_field;
	}

	public void setBefore_id_field(TextField before_id_field) {
		this.before_id_field = before_id_field;
	}

	public JLabel getBefore_pass() {
		return before_pass;
	}

	public void setBefore_pass(JLabel before_pass) {
		this.before_pass = before_pass;
	}

	public TextField getBefore_pass_field() {
		return before_pass_field;
	}

	public void setBefore_pass_field(TextField before_pass_field) {
		this.before_pass_field = before_pass_field;
	}

	public JLabel getChange_id() {
		return change_id;
	}

	public void setChange_id(JLabel change_id) {
		this.change_id = change_id;
	}

	public TextField getChange_id_field() {
		return change_id_field;
	}

	public void setChange_id_field(TextField change_id_field) {
		this.change_id_field = change_id_field;
	}

	public JLabel getChange_pass() {
		return change_pass;
	}

	public void setChange_pass(JLabel change_pass) {
		this.change_pass = change_pass;
	}

	public TextField getChange_pass_field() {
		return change_pass_field;
	}

	public void setChange_pass_field(TextField change_pass_field) {
		this.change_pass_field = change_pass_field;
	}

	public JButton getChange_btn() {
		return change_btn;
	}

	public void setChange_btn(JButton change_btn) {
		this.change_btn = change_btn;
	}

	public Font getMainfont() {
		return mainfont;
	}

	public void setMainfont(Font mainfont) {
		this.mainfont = mainfont;
	}
	
	
	
}

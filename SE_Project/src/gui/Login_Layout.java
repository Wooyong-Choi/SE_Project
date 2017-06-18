package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Login_Layout {
	private Main_Frame mf;
	private JFrame mainFrame;
	private JPanel big_Panel = new JPanel();
	private JPanel upPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JPanel member_login = new JPanel();
	private JLabel id_txt = new JLabel("    아이디");
	private JLabel pass_txt = new JLabel("비밀번호");
	private JLabel empty = new JLabel("                                          ");
	private JLabel empty2 = new JLabel("         ");
	private JLabel login_Hello = new JLabel("### 룰루랄라 프로그램에 오신 것을 환영합니다 ###");
	private JButton member = new JButton("회원가입");
	private JButton login = new JButton("  로그인  ");
	private Font mainFont = new Font("main", Font.BOLD, 30);
	private TextField id_field = new TextField(20);
	private TextField pass_field = new TextField(20);
	
	public Login_Layout() {
		mf = new Main_Frame();
		
		mainFrame = mf.getMainFrame();
		big_Panel.setLayout(new GridLayout(2, 1));
		mainFrame.add(big_Panel);
		
		upPanel.setLayout(new BorderLayout());
		bottomPanel.setLayout(new BorderLayout());
		
		setUpPanel(upPanel);
		setBottomPanel(bottomPanel);
		
		big_Panel.add(upPanel);
		big_Panel.add(bottomPanel);
		
		mainFrame.setVisible(true);
		
	}
	
	public void setUpPanel(JPanel up) {
		JPanel split = new JPanel(new FlowLayout());
		
		login_Hello.setFont(mainFont);
		login_Hello.setHorizontalAlignment(SwingConstants.CENTER);
		
		up.add(split, BorderLayout.SOUTH);
		up.add(login_Hello, BorderLayout.CENTER);
		
		id_txt.setFont(mainFont);
		id_txt.setHorizontalAlignment(SwingConstants.CENTER);
		id_field.setFont(mainFont);
		
		split.add(id_txt);
		split.add(id_field);
	}
	
	public void setBottomPanel(JPanel bottom) {
		JPanel split = new JPanel(new FlowLayout());
		JPanel but_split = new JPanel(new FlowLayout());
		member_login.setLayout(new BorderLayout());
		
		bottom.add(split, BorderLayout.NORTH);
		bottom.add(member_login, BorderLayout.CENTER);
		
		member_login.add(but_split, BorderLayout.NORTH);
		
		pass_txt.setFont(mainFont);
		pass_txt.setHorizontalAlignment(SwingConstants.CENTER);
		pass_field.setFont(mainFont);
		pass_field.setEchoChar('*');
		
		member.setFont(mainFont);
		login.setFont(mainFont);
		
	
		split.add(pass_txt);
		split.add(pass_field);
		
		but_split.add(empty);
		but_split.add(member);
		but_split.add(empty2);
		but_split.add(login);
	}
	
	public TextField getUserId() {
		return id_field;
	}
	
	public TextField getUserPass() {
		return pass_field;
	}
	
	public JButton getMemberBtn() {
		return member;
	}
	
	public JButton getLoginBtn() {
		return login;
	}
	
	public JPanel getMainPanel() {
		return big_Panel;
	}
	
	public JFrame getMainFrame() {
		return mainFrame;
	}
	
	public Dimension setDimension(Dimension d, int width, int height) {
		d.setSize(width, height);
		
		return d;
	}

}

import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.*;
import javax.swing.event.*;

public class GameDemoGUI extends JFrame implements ActionListener, Starter{

	static double grade = 3.0;
	
//	public static final int WINDOW_WIDTH = 1280;//1000
//	public static final int WINDOW_HEIGHT = 720;//500
	public JTextField name;
	public JPanel Difficulty;
	GameDemoGUI gamemain = this;

	int result = 0;
	String playername = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new GameDemoGUI();
		GameDemoGUI fight = new GameDemoGUI();
		fight.setVisible(true);
//		fight.setResizable(false);
	}
	
	public GameDemoGUI() {
		setting();
		JPanel main = new JPanel();
		ImageIcon back = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/mainbackground.png");
		
		JPanel screen = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		screen.setLayout(null);
		
//		main.setLayout(new FlowLayout());
//		main.setBackground(Color.WHITE);
//		JLabel wall = new JLabel();
//		ImageIcon mainwallp = new ImageIcon(myimagePath);
//		Image img = mainwallp.getImage();
//		Image changeImg = img.getScaledInstance(WINDOW_WIDTH, WINDOW_HEIGHT-150
//				, Image.SCALE_SMOOTH);
//		ImageIcon changeIcon = new ImageIcon(changeImg);
//		wall.setIcon(changeIcon);
//		main.add(wall);
		
//		JPanel namePanel = new JPanel();
//		namePanel.setLayout(new FlowLayout());
//		namePanel.setBackground(Color.WHITE);
		
//		JLabel insert = new JLabel("ID : ");
//		insert.setBackground(Color.white);
//		namePanel.add(insert);
		
		name = new JTextField(90);
		name.setBackground(Color.white);
//		namePanel.add(name);
		
//		namePanel.setBounds(300, 300, 500, 100);
		name.setBounds(495, 430, 350, 50);
		screen.add(name);
		
		JButton start = new JButton();
		start.addActionListener(this);
		start.setActionCommand("start");
		//start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		//start.setFocusPainted(false);
		start.setBounds(470, 510, 150, 107);
		ImageIcon startBtn = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/startbut.png");
		start.setIcon(startBtn);
		start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		screen.add(start);
		
		JButton help = new JButton();
		help.addActionListener(this);
		help.setActionCommand("help");
		//help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		//help.setFocusPainted(false);
		help.setBounds(640, 510, 150, 107);
		ImageIcon helpBtn = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/helpbut.png");
		help.setIcon(helpBtn);
		help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		screen.add(help);
	
		add(screen);
		
		setVisible(true);
		//여기까지가 screen panel입니다~ 뀨웅
		//여기까지가 main panel입니다~ 뀨웅
		
	}

	

	public GameDemoGUI(Score s, double updatedgrade, String plname) {
		setting();
		JPanel main = new JPanel();
		ImageIcon back = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/mainbackground.png");
		
		JPanel screen = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		screen.setLayout(null);
		
		
		name = new JTextField(90);
		name.setBackground(Color.white);
//		namePanel.add(name);
		
//		namePanel.setBounds(300, 300, 500, 100);
		name.setBounds(495, 430, 350, 50);
		screen.add(name);
		
		JButton start = new JButton();
		start.addActionListener(this);
		start.setActionCommand("start");
		//start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		//start.setFocusPainted(false);
		start.setBounds(470, 510, 150, 107);
		ImageIcon startBtn = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/startbut.png");
		start.setIcon(startBtn);
		start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		screen.add(start);
		
		JButton help = new JButton();
		help.addActionListener(this);
		help.setActionCommand("help");
		//help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		//help.setFocusPainted(false);
		help.setBounds(640, 510, 150, 107);
		ImageIcon helpBtn = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/helpbut.png");
		help.setIcon(helpBtn);
		help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		screen.add(help);
	
		add(screen);
		
		setVisible(true);
		
		User user = new User();
		user.setId(plname);
		user.setScore(updatedgrade);
		System.out.println(user);
		// 파일입출력 부분 (출력)
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("data.dat"));
			outputStream.writeObject(user);
			outputStream.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.exit(0);
		//여기까지가 screen panel입니다~ 뀨웅
		//여기까지가 main panel입니다~ 뀨웅
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		continued(e);
	}

	public void continued(ActionEvent e)//id만 저장
	{
		String actionCmd = e.getActionCommand();
		
		String input = name.getText();
		if (actionCmd.equals("start")) {
				
				playername = input;
				
				
				int result = JOptionPane.showConfirmDialog(null, "입력한 아이디로 게임을 진행합니다.", "안내메세지",
						JOptionPane.OK_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					// 학점 넘겨주는 부분 구현해야함
					new SelectSkillPortion(gamemain);
					gamemain.setVisible(false);
				}
		}else if (actionCmd.equals("help")) {
			Help helpwindow = new Help();
			helpwindow.setVisible(true);
		}
	}
	
	@Override
	public void setting() {
		// TODO Auto-generated method stub
		setTitle("자바 잡아!!");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setBackground(Color.WHITE);
	}
}
	
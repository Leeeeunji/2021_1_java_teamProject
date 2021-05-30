import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GameDemoGUI extends JFrame implements ActionListener, Starter{

//	public static final int WINDOW_WIDTH = 1280;//1000
//	public static final int WINDOW_HEIGHT = 720;//500
	public JTextField name;
	public JPanel Difficulty;
	GameDemoGUI gamemain = this;
	int result = 0;
	
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		continued(e);
	}

	public void continued(ActionEvent e)
	{
		String actionCmd = e.getActionCommand();
		String tname = "";
		
		if(actionCmd.equals("start"))
		{
			tname = name.getText();
			if(tname.equals("1"))
			{
				int result = JOptionPane.showConfirmDialog(null, "입력한 아이디로 이어서 게임을 진행합니다.", "안내메세지", JOptionPane.OK_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                	new SelectSkillPortion();//gamemain
					gamemain.setVisible(false);
                }
                else {
                	System.out.println("새로운 아이디를 입력하세요.");
                	
                }
//				IDExists exist = new IDExists();
//				exist.setVisible(true);
//				if(result == 1) {
//					
//				}
			}
			else if(tname.equals("0"))
			{
				int result = JOptionPane.showConfirmDialog(null, "저장된 데이터가 없으므로 새로 시작합니다.", "안내메세지", JOptionPane.OK_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                	new SelectSkillPortion();
					gamemain.setVisible(false);
                }
                else {
                	System.out.println("새로운 아이디를 입력하세"
                			+ "요.");
                	
                }
//				IDNotExists nexist = new IDNotExists();
//				nexist.setVisible(true);
			}
		}
		
		else if(actionCmd.equals("help"))
		{
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
	
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class fightScreen extends JFrame implements ActionListener{

	public static final int WINDOW_WIDTH = 1280;
	public static final int WINDOW_HEIGHT = 720;
	
	public fightScreen() {
		setTitle("fight!");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		ImageIcon back;
		back = new ImageIcon("C:\\Users\\이은지\\eclipse-workspace\\FinalTeamProject\\src\\fight.png");
		
		JPanel screen = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		screen.setLayout(null);

//스킬버튼
		JPanel BtnPanel = new JPanel();
		BtnPanel.setLayout(new GridLayout(1, 4));
		
		JButton skill1 = new JButton();
		skill1.addActionListener(this);
		skill1.setActionCommand("skill1");
		//skill1.setBorderPainted(false);
		//skill1.setContentAreaFilled(false);
		//skill1.setFocusPainted(false);
		ImageIcon skill1Icon = new ImageIcon("C:\\Users\\이은지\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		skill1.setIcon(skill1Icon);
		
		JButton skill2 = new JButton();
		skill2.addActionListener(this);
		skill2.setActionCommand("skill2");
		//skill2.setBorderPainted(false);
		//skill2.setContentAreaFilled(false);
		//skill2.setFocusPainted(false);
		ImageIcon skill2Icon = new ImageIcon("C:\\Users\\이은지\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		skill2.setIcon(skill2Icon);
		
		JButton skill3 = new JButton();
		skill3.addActionListener(this);
		skill3.setActionCommand("skill3");
		//skill3.setBorderPainted(false);
		//skill3.setContentAreaFilled(false);
		//skill3.setFocusPainted(false);
		ImageIcon skill3Icon = new ImageIcon("C:\\Users\\이은지\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		skill3.setIcon(skill3Icon);
		
		JButton skill4 = new JButton();
		skill4.addActionListener(this);
		skill4.setActionCommand("skill4");
		//skill4.setBorderPainted(false);
		//skill4.setContentAreaFilled(false);
		//skill4.setFocusPainted(false);
		ImageIcon skill4Icon = new ImageIcon("C:\\Users\\이은지\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		skill4.setIcon(skill4Icon);
		
		BtnPanel.add(skill1);
		BtnPanel.add(skill2);
		BtnPanel.add(skill3);
		BtnPanel.add(skill4);
		
		BtnPanel.setBounds(800, 520, 400, 100);
		screen.add(BtnPanel);

//포션 버튼		
		JButton potion = new JButton();
		potion.addActionListener(this);
		potion.setActionCommand("potion");
		//potion.setBorderPainted(false);
		//potion.setContentAreaFilled(false);
		//potion.setFocusPainted(false);
		potion.setBounds(1070, 380, 125, 125);
		ImageIcon potionIcon = new ImageIcon("C:\\Users\\이은지\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		potion.setIcon(potionIcon);
		screen.add(potion);
		
//주인공
		JLabel hero = new JLabel();
		ImageIcon heroIcon = new ImageIcon("C:\\Users\\이은지\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		hero.setIcon(skill1Icon);
		screen.add(hero);
		
//몬스터		
		
		add(screen);
	}
	
	public static void main(String[] args) {
		fightScreen s = new fightScreen();
		s.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

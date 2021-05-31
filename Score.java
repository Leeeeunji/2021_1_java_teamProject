import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.text.DecimalFormat;

public class Score extends JFrame implements ActionListener, Starter {

	Score s = this;
	DecimalFormat d = new DecimalFormat("#.#");
	SelectSkillPortion m;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Score s = new Score();
//      s.setVisible(true);

	}
	public Score(SelectSkillPortion menu, int result) {

		setting();
		m = menu;
		ImageIcon back;
		back = new ImageIcon(
				"/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/gradingbackground.png");

		JPanel grade = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		grade.setLayout(null);

		
		
		if (result == 0) {
			menu.setGrade(menu.getGrade()-0.3);
		} else {
			menu.setGrade(menu.getGrade()+0.3);
		}
		
		if(menu.getGrade() >= 4.3)
		{
			JLabel showgrade = new JLabel("학점 4.3을 달성했습니다! 게임을 끝내주세요!");
			Font f = new Font("Monospaced", Font.BOLD|Font.ITALIC, 60);
			showgrade.setForeground(Color.white);
			showgrade.setFont(f);
			showgrade.setBounds(300,200,1000,100);
			
			add(showgrade);
		}
		
		
		
		JLabel showgrade = new JLabel("Grade : " + d.format(menu.getGrade()));
		Font f = new Font("Monospaced", Font.BOLD|Font.ITALIC, 100);
		showgrade.setForeground(Color.white);
		showgrade.setFont(f);
		showgrade.setBounds(300,200,1000,100);
		
		add(showgrade);
		
		
		JButton continuing = new JButton("continue");
		continuing.addActionListener(this);
		continuing.setBackground(Color.yellow);
		continuing.setBounds(80,450,500,232);
		String continuingFIlePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/continue.png";
		ImageIcon continuingIcon = new ImageIcon(continuingFIlePath);
		continuing.setIcon(continuingIcon);
		continuing.setBorderPainted(false);
		continuing.setContentAreaFilled(false);
		add(continuing);
				
		JButton quitting = new JButton("quit");
		quitting.addActionListener(this);
		quitting.setBounds(700,450,500,232);
		String quittingFilePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/quit.png";
		ImageIcon quittingIcon = new ImageIcon(quittingFilePath);
		quitting.setIcon(quittingIcon);
		quitting.setBorderPainted(false);
		quitting.setContentAreaFilled(false);
		add(quitting);
		
		add(grade);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCmd = e.getActionCommand();
		
		if(actionCmd.equals("continue")) {
			new SelectSkillPortion(s);
			s.setVisible(false);
		}
		else if(actionCmd.equals("quit")){
			new GameDemoGUI(s, m.getGrade(), m.playername);
			System.exit(0);
		}
	}

	@Override
	public void setting() {
		// TODO Auto-generated method stub
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle("Your grade!");
	}

}
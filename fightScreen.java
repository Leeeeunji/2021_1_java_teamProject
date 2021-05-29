import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//HARD모드 Play Screen

public class fightScreen extends JFrame implements ActionListener, Starter {

	fightScreen fight = this;
	Player player;
	Monster monster;
	JLabel back;
	
	Container c;
	
// 스킬이펙트, 포션이펙트
	ImageIcon sk1, sk2, sk3, sk4, po;
	
	public static void main(String[] args) {
		fightScreen s = new fightScreen();
		s.setVisible(true);
	}

	public fightScreen() {

		setting();
		add(player);
		add(monster);
		sk1 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스크린샷 2021-05-02 오후 8.06.55.png");
		sk2 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스크린샷 2021-05-03 오전 2.05.03.png");
		sk3 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스크린샷 2021-05-03 오전 2.23.39.png");
		sk4 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/KakaoTalk_Photo_2021-05-11-16-51-47.jpeg");
		po = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/KakaoTalk_Photo_2021-05-25-16-49-38.jpeg");
		
		JPanel BtnPanel = new JPanel();
		BtnPanel.setLayout(new GridLayout(1, 4));

		JButton skill1 = new JButton();
		skill1.addActionListener(this);
		skill1.setActionCommand("skill1");
		// skill1.setBorderPainted(false);
		// skill1.setContentAreaFilled(false);
		// skill1.setFocusPainted(false);
		skill1.setIcon(sk1);

		JButton skill2 = new JButton();
		skill2.addActionListener(this);
		skill2.setActionCommand("skill2");
		// skill2.setBorderPainted(false);
		// skill2.setContentAreaFilled(false);
		// skill2.setFocusPainted(false);
		skill2.setIcon(sk2);

		JButton skill3 = new JButton();
		skill3.addActionListener(this);
		skill3.setActionCommand("skill3");
		// skill3.setBorderPainted(false);
		// skill3.setContentAreaFilled(false);
		// skill3.setFocusPainted(false);
		skill3.setIcon(sk3);

		JButton skill4 = new JButton();
		skill4.addActionListener(this);
		skill4.setActionCommand("skill4");
		// skill4.setBorderPainted(false);
		// skill4.setContentAreaFilled(false);
		// skill4.setFocusPainted(false);
		skill4.setIcon(sk4);

		BtnPanel.add(skill1);
		BtnPanel.add(skill2);
		BtnPanel.add(skill3);
		BtnPanel.add(skill4);

		BtnPanel.setBounds(800, 520, 400, 100);
		add(BtnPanel);

//포션 버튼		
		JButton potion = new JButton();
		potion.addActionListener(this);
		potion.setActionCommand("potion");
		// potion.setBorderPainted(false);
		// potion.setContentAreaFilled(false);
		// potion.setFocusPainted(false);
		potion.setBounds(1070, 380, 125, 125);
		potion.setIcon(po);
		add(potion);
//		
//		add(fight);
		
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setting() {
		// TODO Auto-generated method stub
		c = getContentPane();
		back = new JLabel(new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스크린샷 2021-05-30 오전 3.48.29.png"));
		setLayout(null);
		setContentPane(back);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle("싸워라. 이겨라");	
		player = new Player();
		monster = new Monster();
		
		
	}
}

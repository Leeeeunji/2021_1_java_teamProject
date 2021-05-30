import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SelectSkillPortion extends JFrame implements ActionListener, Starter{

	SelectSkillPortion s = this;
	JPanel selectPanel;
	
	//select 되었을 때 필요한 이미지 파일.

	ImageIcon le = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon ho = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/학식스.png");
	ImageIcon am = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/아메리카노.png");
	ImageIcon ba = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/박칵스.png");
	
	ImageIcon sk1 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk2 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk3 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk4 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk5 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk6 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk7 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk8 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk9 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	ImageIcon sk10 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/포션 라벨/레몬에이드.png");
	
	//이건 fight화면에 전달할 fight화면에 맞는 이미지 해상도로 ! (스킬 : 100*100, 포션 : 125 * 125)
	
	
	String lef = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/레몬에이드.png";
	String hof = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/학식스.png";
	String amf = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/아메리카노.png";
	String baf = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/박칵스.png";
	
	String sk1f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시 pic.png";
	String sk2f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시2.png";
	String sk3f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시3.png";
	String sk4f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시 pic.png";
	String sk5f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시2.png";
	String sk6f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시3.png";
	String sk7f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시 pic.png";
	String sk8f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시2.png";
	String sk9f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시3.png";
	String sk10f = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/전달해야하는 이미지/스킬 임시 pic.png";
	
	String[] fightmenu = new String[5];
	
	int pnum =0;
	int snum = 0;
	
	JLabel s1, s2, s3, s4;
	JLabel p;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectSkillPortion s = new SelectSkillPortion();
		s.setVisible(true);
		
	}
	
//	GameDemoGUI game
	public SelectSkillPortion()
	{
		setting();
		
//		setLayout(null);
		JPanel main = new JPanel();
		ImageIcon back = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/skill and potion background.png");
		
		JPanel screen = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		screen.setLayout(null);
//		
//		JLabel skill = new JLabel("스킬을 선택하세요. (3종 선택)");
//		Font f = new Font("Monospaced", Font.ITALIC|Font.PLAIN, 13);
//		skill.setForeground(Color.black);
//		skill.setFont(f);
//		skill.setBounds(40,60,200,50);
//		screen.add(skill);
		
		//스킬 패널 및 버튼 추가
		
		JPanel skillPanel = new JPanel();
		skillPanel.setLayout(new GridLayout(2,5));
		skillPanel.setPreferredSize(new Dimension(800,320));
//		skillPanel.setBackground(Color.red);
		skillPanel.setOpaque(false);
		skillPanel.setBounds(35,130,800,320);
		screen.add(skillPanel);
		
		JButton skill1 = new JButton("스킬1");
		skill1.addActionListener(this);
		skillPanel.add(skill1);
		ImageIcon ski1 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill1.setIcon(ski1);
		skill1.setContentAreaFilled(false);
		skill1.setBorderPainted(false);
		
		JButton skill2 = new JButton("스킬2");
		skill2.addActionListener(this);
		skillPanel.add(skill2);
		ImageIcon ski2 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill2.setIcon(ski2);
		skill2.setContentAreaFilled(false);
		skill2.setBorderPainted(false);
		
		JButton skill3 = new JButton("스킬3");
		skill3.addActionListener(this);
		skillPanel.add(skill3);
		ImageIcon ski3 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill3.setIcon(ski3);
		skill3.setContentAreaFilled(false);
		skill3.setBorderPainted(false);
		
		JButton skill4 = new JButton("스킬4");
		skill4.addActionListener(this);
		skillPanel.add(skill4);
		ImageIcon ski4 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill4.setIcon(ski4);
		skill4.setContentAreaFilled(false);
		skill4.setBorderPainted(false);
		
		JButton skill5 = new JButton("스킬5");
		skill5.addActionListener(this);
		skillPanel.add(skill5);
		ImageIcon ski5 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill5.setIcon(ski5);
		skill5.setContentAreaFilled(false);
		skill5.setBorderPainted(false);
		
		JButton skill6 = new JButton("스킬6");
		skill6.addActionListener(this);
		skillPanel.add(skill6);
		ImageIcon ski6 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill6.setIcon(ski6);
		skill6.setContentAreaFilled(false);
		skill6.setBorderPainted(false);
		
		JButton skill7 = new JButton("스킬7");
		skill7.addActionListener(this);
		skillPanel.add(skill7);
		ImageIcon ski7 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill7.setIcon(ski7);
		skill7.setContentAreaFilled(false);
		skill7.setBorderPainted(false);
		
		JButton skill8 = new JButton("스킬8");
		skill8.addActionListener(this);
		skillPanel.add(skill8);
		ImageIcon ski8 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill8.setIcon(ski8);
		skill8.setContentAreaFilled(false);
		skill8.setBorderPainted(false);
		
		JButton skill9 = new JButton("스킬9");
		skill9.addActionListener(this);
		skillPanel.add(skill9);
		ImageIcon ski9 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill9.setIcon(ski9);
		skill9.setContentAreaFilled(false);
		skill9.setBorderPainted(false);
		
		JButton skill10 = new JButton("스킬10");
		skill10.addActionListener(this);
		skillPanel.add(skill10);
		ImageIcon ski10 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스킬 임시 pic.png");
		skill10.setIcon(ski10);
		skill10.setContentAreaFilled(false);
		skill10.setBorderPainted(false);
		
//		JLabel portion = new JLabel("포션을 선택하세요. (1종)");
//		portion.setForeground(Color.black);
//		portion.setFont(f);
//		portion.setBounds(870,20,150,50);
//		screen.add(portion);
		//포션 패널 및 버튼 추가
		
		JPanel portionPanel = new JPanel();
		portionPanel.setLayout(new GridLayout(2,2));
		portionPanel.setPreferredSize(new Dimension(320,320));
//		portionPanel.setBackground(Color.orange);
		portionPanel.setOpaque(false);
		portionPanel.setBounds(855,133,400,320);
		screen.add(portionPanel);
		
		JButton americano = new JButton("아메리카노");
		americano.addActionListener(this);
		portionPanel.add(americano);
		ImageIcon amer = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/아메리카노.png");
		americano.setIcon(amer);
		americano.setContentAreaFilled(false);
		americano.setBorderPainted(false);
		
		JButton hotsix = new JButton("학식");
		hotsix.addActionListener(this);
		portionPanel.add(hotsix);
		ImageIcon hot = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/학식스.png");
		hotsix.setIcon(hot);
		hotsix.setContentAreaFilled(false);
		hotsix.setBorderPainted(false);
		
		JButton lemonade = new JButton("레몬에이드");
		lemonade.addActionListener(this);
		portionPanel.add(lemonade);
		ImageIcon lemon = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/레몬에이드.png");
		lemonade.setIcon(lemon);
		lemonade.setContentAreaFilled(false);
		lemonade.setBorderPainted(false);
		
		JButton bacak = new JButton("박칵스");
		bacak.addActionListener(this);
		portionPanel.add(bacak);
		ImageIcon bac = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/박칵스.png");
		bacak.setIcon(bac);
		bacak.setContentAreaFilled(false);
		bacak.setBorderPainted(false);
		
		
//		JLabel select = new JLabel("선택된 스킬과 포션");
//		select.setForeground(Color.black);
//		select.setFont(f);
//		select.setBounds(60,380,150,50);
//		screen.add(select);
		
		selectPanel = new JPanel();
		selectPanel.setLayout(new GridLayout(1,5));
		selectPanel.setPreferredSize(new Dimension(1140, 200));
//		selectPanel.setBackground(Color.yellow);
		selectPanel.setOpaque(false);
		selectPanel.setBounds(250,470,1000,130);
		screen.add(selectPanel);

		
		JButton Next = new JButton("Next");
		Next.addActionListener(this);
		Next.setBounds(1000, 630, 230, 40);
		screen.add(Next);
		
		add(screen);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCmd = e.getActionCommand();

		if(actionCmd.equals("Next"))
		{
			new DifficultyChooser();
			s.setVisible(false);
		}
		
		if (actionCmd.equals("아메리카노")) {
			if (pnum == 0) {
				pnum++;
				fightmenu[4] = amf;
				p = new JLabel(am);
				selectPanel.add(p);
				setVisible(true);
			}
		} else if (actionCmd.equals("학식")) {
			if (pnum == 0) {
				pnum++;
				fightmenu[4] = hof;
				p = new JLabel(ho);
				selectPanel.add(p);
				setVisible(true);
			}
		} else if (actionCmd.equals("레몬에이드")) {
			if (pnum == 0) {
				pnum++;
				fightmenu[4] = lef;
				p = new JLabel(le);
				selectPanel.add(p);
				setVisible(true);
			}
		} else if (actionCmd.equals("박칵스")) {
			if (pnum == 0) {
				pnum++;
				fightmenu[4] = baf;
				p = new JLabel(ba);
				selectPanel.add(p);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬1")) {
			if (snum == 0) {
				fightmenu[snum] = sk1f;
				snum++;
				s1 = new JLabel(sk1);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk1f;
				snum++;
				s2 = new JLabel(sk1);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk1f;
				snum++;
				s3 = new JLabel(sk1);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk1f;
				snum++;
				s4 = new JLabel(sk1);
				selectPanel.add(s4);
				setVisible(true);
			}

		} else if (actionCmd.equals("스킬2")) {
			if (snum == 0) {
				fightmenu[snum] = sk2f;
				snum++;
				s1 = new JLabel(sk2);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk2f;
				snum++;
				s2 = new JLabel(sk2);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk2f;
				snum++;
				s3 = new JLabel(sk2);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk2f;
				snum++;
				s4 = new JLabel(sk2);
				selectPanel.add(s4);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬3")) {
			if (snum == 0) {
				fightmenu[snum] = sk3f;
				snum++;
				s1 = new JLabel(sk3);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk3f;
				snum++;
				s2 = new JLabel(sk3);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk3f;
				snum++;
				s3 = new JLabel(sk3);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk3f;
				snum++;
				s4 = new JLabel(sk3);
				selectPanel.add(s4);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬4")) {
			if (snum == 0) {
				fightmenu[snum] = sk4f;
				snum++;
				s1 = new JLabel(sk4);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk4f;
				snum++;
				s2 = new JLabel(sk4);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk4f;
				snum++;
				s3 = new JLabel(sk4);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk4f;
				snum++;
				s4 = new JLabel(sk4);
				selectPanel.add(s4);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬5")) {
			if (snum == 0) {
				fightmenu[snum] = sk5f;
				snum++;
				s1 = new JLabel(sk5);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk5f;
				snum++;
				s2 = new JLabel(sk5);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk5f;
				snum++;
				s3 = new JLabel(sk5);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk5f;
				snum++;
				s4 = new JLabel(sk5);
				selectPanel.add(s4);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬6")) {
			if (snum == 0) {
				fightmenu[snum] = sk6f;
				snum++;
				s1 = new JLabel(sk6);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk6f;
				snum++;
				s2 = new JLabel(sk6);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk6f;
				snum++;
				s3 = new JLabel(sk6);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk6f;
				snum++;
				s4 = new JLabel(sk6);
				selectPanel.add(s4);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬7")) {
			if (snum == 0) {
				fightmenu[snum] = sk7f;
				snum++;
				s1 = new JLabel(sk7);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk7f;
				snum++;
				s2 = new JLabel(sk7);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk7f;
				snum++;
				s3 = new JLabel(sk7);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk7f;
				snum++;
				s4 = new JLabel(sk7);
				selectPanel.add(s4);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬8")) {
			if (snum == 0) {
				fightmenu[snum] = sk8f;
				snum++;
				s1 = new JLabel(sk8);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk8f;
				snum++;
				s2 = new JLabel(sk8);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk8f;
				snum++;
				s3 = new JLabel(sk8);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk8f;
				snum++;
				s4 = new JLabel(sk8);
				selectPanel.add(s4);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬9")) {
			if (snum == 0) {
				fightmenu[snum] = sk9f;
				snum++;
				s1 = new JLabel(sk9);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk9f;
				snum++;
				s2 = new JLabel(sk9);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk9f;
				snum++;
				s3 = new JLabel(sk9);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk9f;
				snum++;
				s4 = new JLabel(sk9);
				selectPanel.add(s4);
				setVisible(true);
			}
		} else if (actionCmd.equals("스킬10")) {
			if (snum == 0) {
				fightmenu[snum] = sk10f;
				snum++;
				s1 = new JLabel(sk10);
				selectPanel.add(s1);
				setVisible(true);
			} else if (snum == 1) {
				fightmenu[snum] = sk10f;
				snum++;
				s2 = new JLabel(sk10);
				selectPanel.add(s2);
				setVisible(true);
			} else if (snum == 2) {
				fightmenu[snum] = sk10f;
				snum++;
				s3 = new JLabel(sk10);
				selectPanel.add(s3);
				setVisible(true);
			} else if (snum == 3) {
				fightmenu[snum] = sk10f;
				snum++;
				s4 = new JLabel(sk10);
				selectPanel.add(s4);
				setVisible(true);
			}
		}
	}

	@Override
	public void setting() {
		// TODO Auto-generated method stub
		setTitle("Select Skills and Portions");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
	
	

}

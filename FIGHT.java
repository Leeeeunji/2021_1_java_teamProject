import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class FIGHT extends JFrame implements ActionListener, Starter{

	FIGHT fight = this;
	Attack at;
	PlayerA player1;
	MonsterC monster1;
	MonsterJ monster2;
	MonsterP monster3;
	JLabel back;
	
	monsterHP mHP;
	playerHP pHP;
	
	int turn = 15;
	int pnum = 0;
	
	public SelectSkillPortion m;
	
	Container c;
	
	// 스킬이펙트, 포션이펙트
	ImageIcon sk1, sk2, sk3, sk4, po;
	String attack, shield, healing;
	String monsterattack;
	JLabel s;
	
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		FIGHT f = new FIGHT();
//		f.setVisible(true);
	}
//	MovingtoFIGHT j
	public FIGHT(SelectSkillPortion menu, String monstertype)
	{
		m = menu;
		setting();
		setfightmenu(menu);
		
		
		add(mHP);
		add(pHP);
		
		if(monstertype.equals("C++")) {
			add(player1);
			add(monster1);
		}
		else if(monstertype.equals("JAVA")) {
			add(player1);
			add(monster2);
		}
		else if(monstertype.equals("PYTHON")) {
			add(player1);
			add(monster3);
		}
		
		add(at);
		
		JPanel BtnPanel = new JPanel();
		BtnPanel.setLayout(new GridLayout(1, 4));
		BtnPanel.setOpaque(false);

		JButton skill1 = new JButton();
		skill1.addActionListener(this);
		skill1.setActionCommand("skill1");
		 skill1.setBorderPainted(false);
		 skill1.setContentAreaFilled(false);
		// skill1.setFocusPainted(false);
		skill1.setIcon(sk1);

		JButton skill2 = new JButton();
		skill2.addActionListener(this);
		skill2.setActionCommand("skill2");
		 skill2.setBorderPainted(false);
		 skill2.setContentAreaFilled(false);
		// skill2.setFocusPainted(false);
		skill2.setIcon(sk2);

		JButton skill3 = new JButton();
		skill3.addActionListener(this);
		skill3.setActionCommand("skill3");
		 skill3.setBorderPainted(false);
		 skill3.setContentAreaFilled(false);
		// skill3.setFocusPainted(false);
		skill3.setIcon(sk3);

		JButton skill4 = new JButton();
		skill4.addActionListener(this);
		skill4.setActionCommand("skill4");
		 skill4.setBorderPainted(false);
		 skill4.setContentAreaFilled(false);
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
		 potion.setBorderPainted(false);
		 potion.setContentAreaFilled(false);
		// potion.setFocusPainted(false);
		potion.setBounds(1070, 380, 125, 125);
		potion.setIcon(po);
		add(potion);
//		
//		add(fight);
		
		
		setVisible(true);
		
	}

	public void setfightmenu(SelectSkillPortion m) {
		sk1 = new ImageIcon(m.fightmenu[0]);
		sk2 = new ImageIcon(m.fightmenu[1]);
		sk3 = new ImageIcon(m.fightmenu[2]);
		sk4 = new ImageIcon(m.fightmenu[3]);
		po = new ImageIcon(m.fightmenu[4]);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCmd = e.getActionCommand();
		
		
			
		if(actionCmd.equals("skill1")) {
			if(m.menu[0] == 1)//스킬1번이 공격스킬일 때
			{	
				turn --;
				player1.attacking();
				at.Attackyes();
				monster1.attacked();
				monster2.attacked();
				monster3.attacked();
				
				int damage = randomdamage();
				mHP.attackedmHP(damage);
				pHP.turnminus(m.getGrade());
//				
//				monster1.attacking();
//				monster2.attacking();
//				monster3.attacking();
//				at.monsterSkill();
			}
			else if(m.menu[0] == 2)//healing
			{
				turn --;
				player1.attacking();
				at.Healingyes();
				
				int heal = randomheal();
				pHP.healingHP(heal,1, m.getGrade());
				
			}
			else if(m.menu[0] == 3)//shield
			{
				turn --;
				player1.attacking();
				at.Shieldyes();
			}
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(800);
						player1.attacked();
						monster1.attacking();
						monster2.attacking();
						monster3.attacking();
						at.monsterSkill();
						
						if(m.menu[0]!=3) {
							int damage = randommonster();
							pHP.attackedpHP(damage, m.getGrade());
							if(pHP.getHP()<=0) {//lose
								new Score(m, 0);
								fight.setVisible(false);
							}
						}
//						else {
//							at.Shieldyes();
//						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
			
		}
		else if(actionCmd.equals("skill2")) {
			if(m.menu[1] == 1)//스킬1번이 공격스킬일 때
			{
				turn --;
				player1.attacking();
				at.Attackyes();
				monster1.attacked();
				monster2.attacked();
				monster3.attacked();
				
				int damage = randomdamage();
				mHP.attackedmHP(damage);
				pHP.turnminus(m.getGrade());
//				
//				monster1.attacking();
//				monster2.attacking();
//				monster3.attacking();
//				at.monsterSkill();
			}
			else if(m.menu[1] == 2)//healing
			{
				turn --;
				player1.attacking();
				at.Healingyes();
				
				int heal = randomheal();
				pHP.healingHP(heal,1, m.getGrade());
			}
			else if(m.menu[1] == 3)//shield
			{
				turn --;
				player1.attacking();
				at.Shieldyes();
			}
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(800);
						player1.attacked();
						monster1.attacking();
						monster2.attacking();
						monster3.attacking();
						at.monsterSkill();
						
						if(m.menu[1]!=3) {
							int damage = randommonster();
							pHP.attackedpHP(damage, m.getGrade());
							if(pHP.getHP()<=0) {//lose
								new Score(m, 0);
								fight.setVisible(false);
							}
						}
//						else {
//							at.Shieldyes();
//						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
		}
		else if(actionCmd.equals("skill3")) {
			if(m.menu[2] == 1)//스킬1번이 공격스킬일 때
			{
				turn --;
				player1.attacking();
				at.Attackyes();
				monster1.attacked();
				monster2.attacked();
				monster3.attacked();
				
				int damage = randomdamage();
				mHP.attackedmHP(damage);
				pHP.turnminus(m.getGrade());
//				
//				monster1.attacking();
//				monster2.attacking();
//				monster3.attacking();
//				at.monsterSkill();
			}
			else if(m.menu[2] == 2)//healing
			{
				turn --;
				player1.attacking();
				at.Healingyes();
				
				int heal = randomheal();
				pHP.healingHP(heal,1, m.getGrade());
			}
			else if(m.menu[2] == 3)//shield
			{
				turn --;
				player1.attacking();
				at.Shieldyes();
				pHP.turnminus(m.getGrade());
			}
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(800);
						player1.attacked();
						monster1.attacking();
						monster2.attacking();
						monster3.attacking();
						at.monsterSkill();
						
						if(m.menu[2]!=3) {
							int damage = randommonster();
							pHP.attackedpHP(damage, m.getGrade());
							if(pHP.getHP()<=0) {//lose
								new Score(m, 0);
								fight.setVisible(false);
							}
						}
//							else {
//							at.Shieldyes();
//						}
//						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
		}
		else if(actionCmd.equals("skill4")) {
			if(m.menu[3] == 1)//스킬1번이 공격스킬일 때
			{
				turn --;
				player1.attacking();
				at.Attackyes();
				monster1.attacked();
				monster2.attacked();
				monster3.attacked();
//				
				int damage = randomdamage();
				mHP.attackedmHP(damage);
				pHP.turnminus(m.getGrade());
//				monster1.attacking();
//				monster2.attacking();
//				monster3.attacking();
//				at.monsterSkill();
			}
			else if(m.menu[3] == 2)//healing
			{
				turn --;
				player1.attacking();
				at.Healingyes();
				
				int heal = randomheal();
				pHP.healingHP(heal,1, m.getGrade());
			}
			else if(m.menu[3] == 3)//shield
			{
				turn --;
				player1.attacking();
				at.Shieldyes();
				pHP.turnminus(m.getGrade());
			}
			
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(800);
						player1.attacked();
						monster1.attacking();
						monster2.attacking();
						monster3.attacking();
						at.monsterSkill();
						
						if(m.menu[3]!=3) {
							int damage = randommonster();
							pHP.attackedpHP(damage, m.getGrade());
							if(pHP.getHP()<=0) {//lose
								new Score(m, 0);
								fight.setVisible(false);
							}
						}
//						else {
//							at.Shieldyes();
//						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
		}
		
		else if(actionCmd.equals("potion")) {
			if(pnum==0) {
				if (m.menu[4] == 1)// americano
				{
					pnum++;
					player1.attacking();
					at.Healingyes();

					int heal = randomheal();
					pHP.healingHP(heal, 0, m.getGrade());

				} else if (m.menu[4] == 2)// hotsix
				{
					pnum++;
					player1.attacking();
					at.Attackyes();
					monster1.attacked();
					monster2.attacked();
					monster3.attacked();

					int damage = randomdamage();
					mHP.attackedmHP(damage);
				} else if (m.menu[4] == 3)// lemonade
				{
					pnum++;
					turn++;
					player1.attacking();
					at.Shieldyes();
					pHP.turnplus(m.getGrade());
				} else if (m.menu[4] == 4)// 박칵스
				{
					pnum++;
					player1.attacking();
					at.Healingyes();

					int heal = randomheal();
					pHP.healingHP(heal, 0, m.getGrade());
				}
			}
		}
		
		if(turn == 0 && mHP.getHP() >0)//loser
		{
			new Score(m, 0);
			fight.setVisible(false);
		}
		
		if(turn >=0 && mHP.getHP()<=0) {//win
			new Score(m, 1);
			fight.setVisible(false);
		}
		
		
		
		
	}


	
	@Override
	public void setting() {
		// TODO Auto-generated method stub
		c = getContentPane();
		back = new JLabel(new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/스크린샷 2021-05-29 오후 4.11.26.png"));
		setLayout(null);
		setContentPane(back);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle("싸워라. 이겨라");	
		
		attack = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/공격스킬.png";
		shield = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/쉴드스킬.png";
		healing = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/힐링.png";
		monsterattack = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/몬스터공격스킬.png";
		
		player1 = new PlayerA();
		monster1 = new MonsterC();
		
		monster2 = new MonsterJ();
		
		monster3 = new MonsterP();
		
		mHP = new monsterHP(1500);
		pHP = new playerHP(1500, 15, m.getGrade());
		
		at = new Attack(attack, shield, healing, monsterattack);
		
		
	}
	
	public int randomdamage() {
		int damage;
		int plus;
		int random = 0;
		if(m.grade <2.5)
		{
			random = (int) ((Math.random() * 50-10)) +10;
		}
		else if(m.grade <=3.0 && m.grade >=2.5)
		{
			random = (int) ((Math.random() * 100-50)) +50;
		}
		else if(m.grade >3.0 && m.grade <=3.5)
		{
			random = (int) ((Math.random() * 150-100)) +100;
		}
		else if(m.grade >3.5 && m.grade <=4.0)
		{
			random = (int) ((Math.random() * 200-150)) +150;
		}		
		else if(m.grade >4.0)
		{
			random = (int) ((Math.random() * 250-200)) +200;
		}
		
		damage = (int) ((Math.random() * 100-50)) + 100;
		plus = random + damage;
		
		return plus;
	}
	
	public int randommonster() {
		int damage;
		int plus;
		int random;
		
		damage = (int) ((Math.random() * 250-50)) + 50;
		
		return damage;
	}
	
	public int randomheal() {
		int heal;
		int random;
		int plus;
		
		heal = (int) ((Math.random() * 150 -50)) +50;
		random = (int) ((Math.random()*10*1))+1;
		plus = (int)(random*m.grade)+ heal;
		
		return plus;
		
	}
}

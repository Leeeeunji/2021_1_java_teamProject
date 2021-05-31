import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Attack extends JLabel{

	ImageIcon attack;
	ImageIcon shield;
	ImageIcon healing;
	ImageIcon monsterattack;
	
	int mx =500;
	int my = 300;
	
	int x = 200;
	int y = 350;
	
	public Attack(String attackimage, String shieldimage, String healingimage, String monsterskillimage) {
		attack = new ImageIcon(attackimage);
		shield = new ImageIcon(shieldimage);
		healing = new ImageIcon(healingimage);
		monsterattack = new ImageIcon(monsterskillimage);
		
		
		setSize(300,242);
		setLocation(x, y);
		setOpaque(false);
		setIcon(null);
		
	}
	
	int n=0;
	public void Attackyes() {
		x=200;
		y=350;
		new Thread(new Runnable() {
			public void run() {
				while(n<130) {
					setIcon(attack);
					x++;
					x++;
					y--;
					setLocation(x,y);
					try {
						Thread.sleep(1);
						n++;
						setIcon(null);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				}
			}
		}).start();
		n=0;
	}
	
	public void Healingyes() {
		x = 50;
		y = 270;
		setSize(1000,750);
		new Thread(new Runnable() {
			public void run() {
				while (n < 130) {
					setIcon(healing);
					y--;
					setLocation(x, y);
					try {
						Thread.sleep(3);
						n++;
						setIcon(null);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		n = 0;
		setSize(300,242);
	}
	
	public void Shieldyes() {
		x = 200;
		y = 370;
		setIcon(shield);
		new Thread(new Runnable() {
			public void run() {
				while (n < 130) {
					setIcon(shield);
					setLocation(x, y);
					try {
						Thread.sleep(1);
						setIcon(shield);
						n++;
						setIcon(null);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		n=0;
	}
	
	public void monsterSkill() {//setLocation(500, 230);//setLocation(500, 230);
		mx = 400;
		my = 300;
		new Thread(new Runnable() {
			public void run() {
				while (n < 130) {
					setIcon(monsterattack);
					mx--;
					mx--;
					my++;
					setLocation(mx, my);
					try {
						Thread.sleep(1);
						n++;
						setIcon(null);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		n=0;
	}
}

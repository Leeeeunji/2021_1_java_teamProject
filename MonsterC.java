import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MonsterC extends JLabel{
	MonsterC monster = this;
	ImageIcon moving0, moving1, attacked, attacking;
	boolean noattack = true;
	boolean pattack = true;//사용자가 공격하는 
	
	public MonsterC() {
//		moving = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/mid_term 복사본.gif");
		moving0 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/monster/Cmonster.png");
//		moving1 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/1.png");
		attacked = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/monster/Cmonsterattacked.png");
		attacking = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/monster/Cmonsterattacking.png");
		
		setIcon(moving0);
		setSize(200,193);
		setLocation(500, 230);
		setOpaque(false);
	}
//	
//	int n = 10;
//	public void moving() {
//		if(noattack == true) {
//			new Thread(new Runnable() {
//				public void run() {
//					while(noattack==true) {
//						try {
//							Thread.sleep(ABORT);
//							setIcon(moving0);
//						}catch(InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//			}).start();
//		}
//	}
	
	public void attacking() {
		noattack=false;
		new Thread(new Runnable() {
			public void run() {
				setIcon(attacking);
				try {
					Thread.sleep(500);
					setIcon(moving0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}
	
	public void attacked() {
		noattack =false;
		new Thread(new Runnable() {
			public void run() {
				setIcon(attacked);
				try {
					setIcon(attacked);
					Thread.sleep(500);
					setIcon(moving0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		noattack=true;
	}
	
}

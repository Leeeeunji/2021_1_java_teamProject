import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MonsterP extends JLabel{
	MonsterP monster = this;
	ImageIcon moving0, moving1, attacked, attacking;
	boolean noattack = true;
	boolean pattack = true;//사용자가 공격하는 
	
	public MonsterP() {
//		moving = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/mid_term 복사본.gif");
		moving0 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/monster/Pmonster.png");
//		moving1 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/1.png");
		attacked = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/monster/Pmonsterattacked.png");
		attacking = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/monster/Pmonsterattacking.png");
		
		setIcon(moving0);
		setSize(200,193);
		setLocation(500, 230);
		setOpaque(false);
//		moving();
		
	}
//	int n = 10;
//	public void moving() {
//		if(noattack == true) {
//			new Thread(new Runnable() {
//				public void run() {
//					while(n>0) {
//						try {
//							Thread.sleep(300);
//							setIcon(moving1);
//							Thread.sleep(300);
//							setIcon(moving0);
//							n--;
//						}catch(InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//					noattack = false;
//					attacking();
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

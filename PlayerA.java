import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PlayerA extends JLabel{
	PlayerA player1 = this;
	ImageIcon moving0, moving1, attacked, attacking;
	boolean noattack = true;
	boolean pattack = true;//사용자가 공격하는 
	
	public PlayerA() {
//		moving = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/mid_term 복사본.gif");
		moving0 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/player2.png");
		moving1 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/player1.png");
		attacked = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/playerattacked.png");
		attacking = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/playerattacking.png");
		
		setIcon(moving0);
		setSize(200,193);
		setLocation(50, 450);
		moving();
		setOpaque(false);
	}
	
	public void moving() {
		if (noattack == true) {
			new Thread(new Runnable() {
				public void run() {
					while (noattack == true) {
						try {
							Thread.sleep(500);
							setIcon(moving1);
							Thread.sleep(500);
							setIcon(moving0);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
		}
	}

	
	public void attacking() {
		noattack = false;
		new Thread(new Runnable() {
			public void run() {
				setIcon(attacking);
				try {
					setIcon(attacking);
					Thread.sleep(1500);
					setIcon(moving0);
//					m.attacked();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		noattack=true;
	
	}
	
	public void attacked() {
		noattack = false;
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

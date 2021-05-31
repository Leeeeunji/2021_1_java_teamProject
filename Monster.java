import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Monster extends JLabel{
	Monster monster = this;
	ImageIcon moving0, moving1, attacked, attacking;
	boolean noattack = true;
	boolean pattack = true;//사용자가 공격하는 
	
	public Monster() {
//		moving = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/mid_term 복사본.gif");
		moving0 = new ImageIcon("C:\\Users\\이은지\\eclipse-workspace\\FinalTeamProject\\src\\은주.png");
//		moving1 = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/1.png");
//		attacked = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/아파.png");
//		attacking = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/공격.png");
		
		setIcon(moving0);
		setSize(200,180);
		setLocation(500, 200);
//		moving();
		
	}
	int n = 10;
	public void moving() {
		if(noattack == true) {
			new Thread(new Runnable() {
				public void run() {
					while(n>0) {
						try {
							Thread.sleep(300);
							setIcon(moving1);
							Thread.sleep(300);
							setIcon(moving0);
							n--;
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					noattack = false;
					attacking();
				}
			}).start();
		}
	}
	
	public void attacking() {
		setSize(200,165);
		if(noattack== false) {
			if(pattack==true) {
				new Thread(new Runnable() {
					public void run() {
						setIcon(attacking);
						try {
							Thread.sleep(2000);
							noattack = true;
							n=10;
							setSize(150,190);
							moving();
	
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
	}
	
	public void attacked() {
		if(noattack== false) {
			if(pattack==false) {
				new Thread(new Runnable() {
					public void run() {
						setIcon(attacked);
						try {
							Thread.sleep(2000);
							noattack = true;
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
	}
	
}

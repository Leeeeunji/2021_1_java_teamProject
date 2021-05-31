import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MovingtoFIGHTH extends JFrame{

	public static final int WINDOW_WIDTH = 1280;//1000
	public static final int WINDOW_HEIGHT = 720;//500
	
	JLabel main;
	JLabel sub;
	ImageIcon back;
	ImageIcon character;
	public SelectSkillPortion m;
	
	MovingtoFIGHTH f = this;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MovingtoFIGHT m = new MovingtoFIGHT();
//		m.setVisible(true);
	}
	//NormalWorldMap n
	public MovingtoFIGHTH(SelectSkillPortion menu, String monster)
	{
		setTitle("전투 지역으로 이동 중.....");
		m = menu;
		
		main = new JLabel();
		back = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/ezgif.com-resize-2.gif");
		main.setIcon(back);
		main.setLayout(null);
		
		setSize(back.getIconWidth(), back.getIconHeight());
		setLocationRelativeTo(null);
	
		
		add(main);
		
		new Thread(new Runnable() {
			public void run() {
				int n=0;
				while(true) {
					try {
						Thread.sleep(1000);
						n++;
						if(n==6) {
							new fightScreen(m, monster);
							f.setVisible(false);
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		setVisible(true);
	}

}
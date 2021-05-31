import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MovingtoFIGHT extends JFrame {

	public static final int WINDOW_WIDTH = 1280;//1000
	public static final int WINDOW_HEIGHT = 720;//500
	
	JLabel main;
	JLabel sub;
	ImageIcon back;
	ImageIcon character;
	
	MovingtoFIGHT f = this;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingtoFIGHT m = new MovingtoFIGHT();
		m.setVisible(true);
	}
	
	public MovingtoFIGHT()
	{
		setTitle("Choose the difficulty");
		
		main = new JLabel();
		back = new ImageIcon("C:\\Users\\¿Ã¿∫¡ˆ\\eclipse-workspace\\FinalTeamProject\\src");
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
						if(n==7) {
							new FIGHT();
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

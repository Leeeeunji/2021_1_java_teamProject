import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class HardWorldMap extends JFrame implements ActionListener, Starter{
	
	private JLabel worldMapTitle;
	public static final int WORLDMAPSIZE = 3;
	private HardWorldMap hard = this;
	public SelectSkillPortion m;
	
	
//	public static void main(String[] args) {
//		HardWorldMap HW = new HardWorldMap();
//		HW.setVisible(true);
//		HW.setResizable(false);
//	}
//	
	
	public HardWorldMap(SelectSkillPortion menu) {
		setting();
		m = menu;
		
		ImageIcon back;
		back = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/worldmap background.png");
		
		JPanel world = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		world.setLayout(null);
		
		JButton world1 = new JButton("C++");
		world1.setBackground(Color.BLUE);
		world1.addActionListener(this);
		world1.setBounds(40, 170, 400, 500);
		String world1FileName = "prac.png";
		String world1IconFilePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/C-hard.png";
		ImageIcon world1Icon = new ImageIcon(world1IconFilePath);
		world1.setIcon(world1Icon);
		world1.setBorderPainted(false);
		world1.setContentAreaFilled(false);
		world.add(world1);
		
		JButton world2 = new JButton("JAVA");
		world2.setBackground(Color.RED);
		world2.addActionListener(this);
		world2.setBounds(440, 170, 400, 500);
		String world2FileName = "prac.png";
		String world2IconFilePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/Java-hard.png";
		ImageIcon world2Icon = new ImageIcon(world2IconFilePath);
		world2.setIcon(world2Icon);
		world2.setBorderPainted(false);
		world2.setContentAreaFilled(false);
		world.add(world2);
		
		JButton world3 = new JButton("PYTHON");
		world3.setBackground(Color.CYAN);
		world3.addActionListener(this);
		world3.setBounds(840, 170, 400, 500);
		String world3FileName = "prac.png";
		String world3IconFilePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/Py-hard.png";
		ImageIcon world3Icon = new ImageIcon(world3IconFilePath);
		world3.setIcon(world3Icon);
		world3.setBorderPainted(false);
		world3.setContentAreaFilled(false);
		world.add(world3);
		
		
		add(world);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCmd = e.getActionCommand();
		if(actionCmd.equals("C++")) {
			new MovingtoFIGHTH(m, actionCmd);
			hard.setVisible(false);
		}else if(actionCmd.equals("JAVA")) {
			new MovingtoFIGHTH(m, actionCmd);
			hard.setVisible(false);
		}else if(actionCmd.equals("PYTHON")){
			new MovingtoFIGHTH(m, actionCmd);
			hard.setVisible(false);
		}
	}
	@Override
	public void setting() {
		// TODO Auto-generated method stub
		setTitle("<HARD> Choose WorldMap!");
		setBackground(Color.CYAN);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
}

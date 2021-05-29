import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class HardWorldMap extends JFrame implements ActionListener{
	
	private JLabel worldMapTitle;
	public static final int WORLDMAPSIZE = 3;
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	private HardWorldMap hard = this;
	
	/*
	public static void main(String[] args) {
		HardWorldMap HW = new HardWorldMap();
		HW.setVisible(true);
		HW.setResizable(false);
	}
	*/
	
	public HardWorldMap(DifficultyChooser choose) {
		super("<HARD> Choose WorldMap!");
		setBackground(Color.CYAN);
		setSize(WIDTH, HEIGHT);
		setLayout(null);
		
		worldMapTitle = new JLabel("Select worldmap!");
		
		worldMapTitle.setBackground(Color.YELLOW);
		worldMapTitle.setBounds(40, 30, 900, 30);
		add(worldMapTitle);
		
		JButton world1 = new JButton("C++");
		world1.setBackground(Color.BLUE);
		world1.addActionListener(this);
		world1.setBounds(40, 90, 400, 500);
		String world1FileName = "prac.png";
		String world1IconFilePath = "C:\\Users\\이은지\\eclipse-workspace\\TeamProject\\src\\prac.png";
		ImageIcon world1Icon = new ImageIcon(world1IconFilePath);
		world1.setIcon(world1Icon);
		add(world1);
		
		JButton world2 = new JButton("JAVA");
		world2.setBackground(Color.RED);
		world2.addActionListener(this);
		world2.setBounds(440, 90, 400, 500);
		String world2FileName = "prac.png";
		String world2IconFilePath = "C:\\Users\\이은지\\eclipse-workspace\\TeamProject\\src\\prac.png";
		ImageIcon world2Icon = new ImageIcon(world2IconFilePath);
		world2.setIcon(world2Icon);
		add(world2);
		
		JButton world3 = new JButton("PYTHON");
		world3.setBackground(Color.CYAN);
		world3.addActionListener(this);
		world3.setBounds(840, 90, 400, 500);
		String world3FileName = "prac.png";
		String world3IconFilePath = "C:\\Users\\이은지\\eclipse-workspace\\TeamProject\\src\\prac.png";
		ImageIcon world3Icon = new ImageIcon(world3IconFilePath);
		world3.setIcon(world3Icon);
		add(world3);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCmd = e.getActionCommand();
		if(actionCmd.equals("C++")) {
			
		}else if(actionCmd.equals("JAVA")) {

		}else if(actionCmd.equals("PYTHON")){
			
		}else {
			
		}
	}
}

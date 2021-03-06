import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DifficultyChooser extends JFrame implements ActionListener, Starter{
//	
//	public static final int WINDOW_WIDTH = 1280;//1000
//	public static final int WINDOW_HEIGHT = 720;//500
	
	private DifficultyChooser difficult = this;
	public SelectSkillPortion m;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DifficultyChooser d = new DifficultyChooser();
//		d.setVisible(true);
	}
	
//	SelectSkillPortion e
	public DifficultyChooser(SelectSkillPortion menu)
	{
		m = menu;
		
		setting();
		
		ImageIcon back;
		back = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/difficultselectbackground.png");
		
		JPanel Difficulty = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		Difficulty.setLayout(null);
//		
//		JLabel diff = new JLabel("Select Difficulty");
//		Font f = new Font("Monospaced", Font.BOLD|Font.ITALIC, 30);
//		diff.setForeground(Color.BLACK);
//		diff.setFont(f);
//		diff.setBounds(500,50,400,100);
		
		JButton normal = new JButton("Normal");
		normal.addActionListener(this);
		normal.setBackground(Color.yellow);
		normal.setBounds(80,200,500,500);
		String normalFIlePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/Normal.png";
		ImageIcon normalIcon = new ImageIcon(normalFIlePath);
		normal.setIcon(normalIcon);
		normal.setBorderPainted(false);
		normal.setContentAreaFilled(false);
				
		JButton hard = new JButton("Hard");
		hard.addActionListener(this);
		hard.setBounds(700,200,500,500);
		String hardFilePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/hhard.png";
		ImageIcon hardIcon = new ImageIcon(hardFilePath);
		hard.setIcon(hardIcon);
		hard.setBorderPainted(false);
		hard.setContentAreaFilled(false);
		
		
//		Difficulty.add(diff);
		Difficulty.add(normal);
		Difficulty.add(hard);
		
		add(Difficulty);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCmd = e.getActionCommand();

		if(actionCmd.equals("Normal"))
		{
			new NormalWorldMap(m);
			difficult.setVisible(false);
		}
		else if(actionCmd.equals("Hard"))
		{
			new HardWorldMap(m);
			difficult.setVisible(false);
		}
	}

	@Override
	public void setting() {
		// TODO Auto-generated method stub
		setTitle("Choose the difficulty");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}

	
//	
//	
//	add("2", Difficulty);
}
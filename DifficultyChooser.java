import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DifficultyChooser extends JFrame implements ActionListener{
	
	public static final int WINDOW_WIDTH = 1280;//1000
	public static final int WINDOW_HEIGHT = 720;//500
	
	private DifficultyChooser difficult = this;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DifficultyChooser d = new DifficultyChooser();
//		d.setVisible(true);
	}
	
//	GameDemoGUI gui
	public DifficultyChooser(GameDemoGUI gui)
	{
		
		setTitle("Choose the difficulty");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		ImageIcon back;
		back = new ImageIcon("/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/gggg.jpg");
		
		JPanel Difficulty = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		Difficulty.setLayout(null);
		
		JLabel diff = new JLabel("Select Difficulty");
		Font f = new Font("Monospaced", Font.BOLD|Font.ITALIC, 30);
		diff.setForeground(Color.BLACK);
		diff.setFont(f);
		diff.setBounds(500,100,400,100);
		
		JButton normal = new JButton("Normal");
		normal.addActionListener(this);
		normal.setBackground(Color.yellow);
		normal.setBounds(240,450,300,150);
				
		JButton hard = new JButton("Hard");
		hard.addActionListener(this);
		hard.setBounds(740,450,300,150);
		
		Difficulty.add(diff);
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
//			new Normal(difficult);
			difficult.setVisible(false);
		}
		else if(actionCmd.equals("Hard"))
		{
//			new Hard(difficult);
			difficult.setVisible(false);
		}
	}

	
//	
//	
//	add("2", Difficulty);
}

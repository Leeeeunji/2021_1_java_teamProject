import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SelectSkillPortion extends JFrame implements ActionListener{

	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	SelectSkillPortion s = this;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SelectSkillPortion s = new SelectSkillPortion();
//		s.setVisible(true);
		
	}
	
//	GameDemoGUI game
	public SelectSkillPortion(GameDemoGUI game)
	{
		setTitle("Select Skills and Portions");
		setSize(WIDTH, HEIGHT);
//		setLayout(null);
		
		JPanel back = new JPanel();
		back.setLayout(null);

		
		JLabel skill = new JLabel("스킬을 선택하세요. (3종 선택)");
		Font f = new Font("Monospaced", Font.ITALIC|Font.PLAIN, 13);
		skill.setForeground(Color.black);
		skill.setFont(f);
		skill.setBounds(60,20,200,50);
		back.add(skill);
		
		
		JPanel skillPanel = new JPanel();
		skillPanel.setLayout(new GridLayout(2,5));
		skillPanel.setPreferredSize(new Dimension(800,320));
		skillPanel.setBackground(Color.red);
		skillPanel.setBounds(60,55,800,320);
		back.add(skillPanel);
		
		JLabel portion = new JLabel("포션을 선택하세요. (1종)");
		portion.setForeground(Color.black);
		portion.setFont(f);
		portion.setBounds(890,20,150,50);
		back.add(portion);
		
		JPanel portionPanel = new JPanel();
		portionPanel.setLayout(new GridLayout(2,2));
		portionPanel.setPreferredSize(new Dimension(320,320));
		portionPanel.setBackground(Color.orange);
		portionPanel.setBounds(890,55,320,320);
		back.add(portionPanel);
		
		JLabel select = new JLabel("선택된 스킬과 포션");
		select.setForeground(Color.black);
		select.setFont(f);
		select.setBounds(60,380,150,50);
		back.add(select);
		
		JPanel selectPanel = new JPanel();
		selectPanel.setLayout(null);
		selectPanel.setPreferredSize(new Dimension(1140, 200));
		selectPanel.setBackground(Color.yellow);
		selectPanel.setBounds(60,420,1160,200);
		back.add(selectPanel);
		
		JButton Reset = new JButton("Reset");
		Reset.addActionListener(this);
		Reset.setBounds(750, 630, 230, 40);
		back.add(Reset);
		
		JButton Next = new JButton("Next");
		Next.addActionListener(this);
		Next.setBounds(1000, 630, 230, 40);
		back.add(Next);
		
		add(back);
		
		setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCmd = e.getActionCommand();

		if(actionCmd.equals("Reset"))
		{
			
		}
		else if(actionCmd.equals("Next"))
		{
			new DifficultyChooser(s);
			s.setVisible(false);
		}
	}

}

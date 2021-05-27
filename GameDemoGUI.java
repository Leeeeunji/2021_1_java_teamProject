import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GameDemoGUI extends JFrame implements ActionListener{

	public static final int WINDOW_WIDTH = 1280;//1000
	public static final int WINDOW_HEIGHT = 720;//500
	public JTextField name;
	public JPanel Difficulty;
	GameDemoGUI gamemain = this;
	int result = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new GameDemoGUI();
		GameDemoGUI fight = new GameDemoGUI();
		fight.setVisible(true);
//		fight.setResizable(false);
	}
	
	public GameDemoGUI() {
		setTitle("자바 잡아!!");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setBackground(Color.WHITE);
		
		JPanel main = new JPanel();
		
		String myimagePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/IMG_1588 2.jpg";
		
		main.setLayout(new FlowLayout());
		main.setBackground(Color.WHITE);
		
		JLabel wall = new JLabel();
		ImageIcon mainwallp = new ImageIcon(myimagePath);
		Image img = mainwallp.getImage();
		Image changeImg = img.getScaledInstance(WINDOW_WIDTH, WINDOW_HEIGHT-150
				, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		wall.setIcon(changeIcon);
		main.add(wall);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new FlowLayout());
		namePanel.setBackground(Color.WHITE);
		
		JLabel insert = new JLabel("ID : ");
		insert.setBackground(Color.white);
		namePanel.add(insert);
		
		name = new JTextField(90);
		name.setBackground(Color.white);
		namePanel.add(name);
		
		main.add(namePanel);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(1,2));
		btnPanel.setBackground(Color.WHITE);
		main.add(btnPanel);
		
		JButton start = new JButton("Start");
		start.addActionListener(this);
		btnPanel.add(start);
		
		JButton help = new JButton("Help!");
		help.addActionListener(this);
		btnPanel.add(help);
	
		add(main);
		
		setVisible(true);
		//여기까지가 main panel입니다~ 뀨웅
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		continued(e);
	}

	public void continued(ActionEvent e)
	{
		String actionCmd = e.getActionCommand();
		String tname = "";
		
		if(actionCmd.equals("Start"))
		{
			tname = name.getText();
			if(tname.equals("1"))
			{
				int result = JOptionPane.showConfirmDialog(null, "입력한 아이디로 이어서 게임을 진행합니다.", "안내메세지", JOptionPane.OK_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                	new DifficultyChooser(gamemain);
					gamemain.setVisible(false);
                }
                else {
                	System.out.println("새로운 아이디를 입력하세요.");
                	
                }
//				IDExists exist = new IDExists();
//				exist.setVisible(true);
//				if(result == 1) {
//					
//				}
			}
			else if(tname.equals("0"))
			{
				int result = JOptionPane.showConfirmDialog(null, "저장된 데이터가 없으므로 새로 시작합니다.", "안내메세지", JOptionPane.OK_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                	new DifficultyChooser(gamemain);
					gamemain.setVisible(false);
                }
                else {
                	System.out.println("새로운 아이디를 입력하세"
                			+ "요.");
                	
                }
//				IDNotExists nexist = new IDNotExists();
//				nexist.setVisible(true);
			}
		}
		
		else if(actionCmd.equals("Help!"))
		{
			Help helpwindow = new Help();
			helpwindow.setVisible(true);
		}
	}
	
//	private class IDExists extends JFrame implements ActionListener {
//		public IDExists() {
//			setSize(300, 200);
//			getContentPane().setBackground(Color.LIGHT_GRAY);
//			setLayout(new BorderLayout());
//			JLabel confirmLabel = new JLabel("입력한 아이디로 이어서 게임을 진행합니다.");
//			add(confirmLabel, BorderLayout.CENTER);
//			
//			JPanel btnPanel = new JPanel();
//			btnPanel.setBackground(Color.WHITE);
//			btnPanel.setLayout(new FlowLayout());
//
//			JButton confirmBtn = new JButton("Start!");
//			confirmBtn.addActionListener(this);
//			btnPanel.add(confirmBtn);
//
//			add(btnPanel, BorderLayout.SOUTH);
//		}
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			String actionCmd = e.getActionCommand();
//			if (actionCmd.equals("Start!")) {
//				dispose();
//			} else
//				System.err.println("Unexpected Error" + " in Confirm Window");
//		}
//	} // end of IDExists
//	
//	private class IDNotExists extends JFrame implements ActionListener {
//		public IDNotExists() {
//			setSize(300, 200);
//			getContentPane().setBackground(Color.LIGHT_GRAY);
//			setLayout(new BorderLayout());
//			JLabel confirmLabel = new JLabel("저장된 데이터가 없으므로 새로 시작합니다.");
//			add(confirmLabel, BorderLayout.CENTER);
//			
//
//			JPanel btnPanel = new JPanel();
//			btnPanel.setBackground(Color.WHITE);
//			btnPanel.setLayout(new FlowLayout());
//
//			JButton confirmBtn = new JButton("Start!");
//			confirmBtn.addActionListener(this);
//			btnPanel.add(confirmBtn);
//
//			add(btnPanel, BorderLayout.SOUTH);
//		}
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			String actionCmd = e.getActionCommand();
//			if (actionCmd.equals("Start!")) {
//				result = 1;
//				setVisible(false);
//			} else
//				System.err.println("Unexpected Error" + " in Confirm Window");
//		}
//	} // end of IDExists
}

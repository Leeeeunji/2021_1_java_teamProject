import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lose extends JFrame
implements ActionListener{
	
	private double grade;
	private double change;
	
	public Lose() {
		super("게임 결과");
		grade = 1.0; //grade 초기화!
		change = 0.0;
		setSize(1280, 720);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		
		JLabel WonLabel = new JLabel("YOU LOST!");
		WonLabel.setFont(new Font("SanSerif", Font.BOLD, 30));
		WonLabel.setForeground(Color.RED);
		WonLabel.setBackground(Color.YELLOW);
		add(WonLabel, BorderLayout.NORTH);
		
		JPanel GradePanel = new JPanel();
		GradePanel.setLayout(new GridLayout(2, 1));
		
		JLabel LostGradeLabel = new JLabel();
		LostGradeLabel.setText("잃은 학점 : " + String.valueOf(change));
		LostGradeLabel.setFont(new Font("SanSerif", Font.BOLD, 30));
		LostGradeLabel.setForeground(Color.RED);
		LostGradeLabel.setBackground(Color.YELLOW);
		GradePanel.add(LostGradeLabel);
		
		JLabel GradeLabel = new JLabel();
		LostGradeLabel.setText("총 학점 : " + String.valueOf(grade));
		GradeLabel.setFont(new Font("SanSerif", Font.BOLD, 30));
		GradeLabel.setForeground(Color.RED);
		GradeLabel.setBackground(Color.YELLOW);
		GradePanel.add(GradeLabel);
		
		add(GradePanel, BorderLayout.CENTER);
		
		JPanel BtnPanel = new JPanel();
		BtnPanel.setLayout(new GridLayout(1, 2));
		
		JButton NextGameBtn = new JButton("다음 게임");
		NextGameBtn.setBackground(Color.RED);
		NextGameBtn.addActionListener(this);
		BtnPanel.add(NextGameBtn);
		
		JButton ExitBtn = new JButton("종료");
		ExitBtn.setBackground(Color.RED);
		ExitBtn.addActionListener(this);
		BtnPanel.add(ExitBtn);
		
		add(BtnPanel, BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		Lose LoseWindow = new Lose();
		LoseWindow.setVisible(true);
		LoseWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		String btnStr = e.getActionCommand();
		
		if(btnStr.equals("다음 게임")) {
			
		}else if (btnStr.equals("종료")) {
			//끝내기 전 파일입출력으로 아이디에 학점 저장
			System.exit(0);
		}else {
			System.err.println("Unexpected error.");
		}
			
	}

}
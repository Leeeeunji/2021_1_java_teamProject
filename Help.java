import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//메인코드에 이거 추가
//Help helpWindow = new Help();
//helpWindow.setVisible(true);

public class Help extends JFrame
implements ActionListener{
	public Help() {
		super("Help!");
		setSize(800, 450);
		getContentPane().setBackground(Color.white);
		setLayout(new BorderLayout());
		
		String helpString = "<html>먼저 게임에 등록할 ID를 입력해주세요. <br><br>이미 입력한 ID로 게임을 진행한 기록이 있을 경우엔 해당 ID로 게임을 이어서 진행할 수 있습니다. <br><br>"
				+ "그렇지 않을 경우엔, 해당 ID로 처음부터 게임을 진행할 수 있습니다. <br><br> 게임을 시작하면, 자신의 캐릭터가 사용할 스킬과 포션을 선택합니다. <br><br>"
				+ "그 후, 게임의 난이도를 선택합니다. (Normal|Hard)<br><br>"
				+ "(경고) 일정 학점을 획득하여 캐릭터를 성장시키지 않으면 Hard 모드를 완수하기에 어려움이 있을 수 있습니다!<br><br>"
				+ "(학점 3.7 달성 시 -> 사용자 업그레이드, 학점 4.0 달성 시 -> 사용자 업그레이드 <br><br>"
				+ "행운을 빕니다! <br></html>";
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(Color.white);
		JButton homeBtn = new JButton("HOME!");
		homeBtn.setBackground(Color.WHITE);
		homeBtn.addActionListener(this);
		btnPanel.add(homeBtn);
		add(btnPanel, BorderLayout.SOUTH);
		
		JPanel helpPanel = new JPanel();
		JLabel helpLabel = new JLabel(helpString);
		Font f = new Font("Monospaced", Font.PLAIN, 15);
		helpLabel.setForeground(Color.BLACK);
		helpLabel.setFont(f);
		helpPanel.add(helpLabel);
		add(helpPanel, BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args) {
		Help helpWindow = new Help();
		helpWindow.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String btnStr = e.getActionCommand();
		
		if(btnStr.equals("HOME!")) {
			dispose();
		}else {
			System.err.println("Unexpected error.");
		}
			
	}

}
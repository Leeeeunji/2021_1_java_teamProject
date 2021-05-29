import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class FIGHT extends JFrame implements ActionListener{

	
	public FIGHT(MovingtoFIGHT j)
	{
		setTitle("싸워라. 이겨라");
		setSize(1280,720);
		setLayout(null);
		setVisible(true);
		
		JLabel x = new JLabel("싸울 거야!!!!");
		Font f = new Font("Monospaced", Font.BOLD|Font.ITALIC, 30);
		x.setForeground(Color.BLACK);
		x.setFont(f);
		x.setBounds(500,100,400,100);
		
		add(x);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.text.DecimalFormat;

public class playerHP extends JLabel{
	playerHP p = this;
	int hp;
	int turn;
	Font f = new Font("Monospaced", Font.BOLD|Font.ITALIC, 20);
	DecimalFormat d = new DecimalFormat("#.#");

	public playerHP(int hp, int turn, double grade) {
		this.hp = hp;
		this.turn = turn;
		setSize(200, 100);
		setLocation(40, 10);
		setForeground(Color.white);
		setText("<html>Player : " + hp + "<br>Turn : " + turn + "<br>Grade : " + d.format(grade) + "</html>");
		setFont(f);
	}
	
	public void attackedpHP(int damage, double grade) {
		
		hp = hp - damage;
		setText("<html>Player : " + hp + "<br>Turn : " + turn + "<br>Grade : " + d.format(grade) + "</html>");
		
	}
	
	public void healingHP(int heal, int de, double grade) {
		if(de == 0)
		{
			hp = hp + heal;
			setText("<html>Player : " + hp + "<br>Turn : " + turn + "<br>Grade : " + d.format(grade) + "</html>");
		}
		else {
			hp = hp + heal;
			turn--;
			setText("<html>Player : " + hp + "<br>Turn : " + turn + "<br>Grade : " + d.format(grade) + "</html>");
		}
	}
	
	public void turnminus(double grade) {
		turn= turn-1;
		setText("<html>Player : " + hp + "<br>Turn : " + turn + "<br>Grade : " +d.format(grade) + "</html>");
	}
	
	public void turnplus(double grade) {
		turn = turn +1;
		setText("<html>Player : " + hp + "<br>Turn : " + turn + "<br>Grade : " + d.format(grade) + "</html>");
	}
	
	public int getHP() {
		return hp;
	}
}
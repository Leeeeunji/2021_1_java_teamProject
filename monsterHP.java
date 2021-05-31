import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class monsterHP extends JLabel{
	monsterHP m = this;
	int hp ;
	Font f = new Font("Monospaced", Font.BOLD|Font.ITALIC, 20);
	
	public monsterHP(int hp) {
		this.hp =hp;
		setSize(200, 100);
		setLocation(1000, 10);
		setFont(f);
		setForeground(Color.white);
		setText("Monster : " + hp);
	}
	
	public void attackedmHP(int damage) {
		hp = hp - damage;
		setText("Monster : " + hp);
	}
	
	public int getHP() {
		return hp;
	}
}

import java.util.Scanner;

public class GameDemoC {

	public static double grade = 3.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String menu = "";
		String mode = "";
		System.out.println("Game start!");
		
		System.out.println("Select the menu (Start | Help!)");
		menu = keyboard.next();
		
		switch(menu) {
			case("Start")://start 했을 시 바로 시작
				break;
			
			case("Help")://help 선택 시 도움말 주고 시
				System.out.println("Select the difficulty (Normal | Hard) and you will "
						+ "get to choose your skills and portions! Fight with your monsters!"
						+ "WARNING! it's much harder to kill Hard-mode monster, so please try the normal mode first!"
						+ "if you achieve your grade up to 3.7, your skills will be upgraded, and if you achieve your grade"
						+ "up to 4.0, your skills will be upgraded!\n GOOD LUCK");
				break;
		}
		
		System.out.println("Select the mode (Normal | Hard)");
		mode = keyboard.next();
		
		if(mode.equals("Normal"))
		{
			Normal normal = new Normal();
			
		}
		
		
	}

}
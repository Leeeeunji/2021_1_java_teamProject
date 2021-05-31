public class Hard implements Difficulty{

	public Hard(){
		int random = (int)((Math.random() * (1500-500))+500);
		for(int i=0;i<10;i++) {
			skills[i] = 7000 + random;//데미지 설정
		}
	}
}
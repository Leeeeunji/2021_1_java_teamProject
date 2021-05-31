public class Normal implements Difficulty{
	
	public Normal(){
		int random = (int)((Math.random() * (500-200))+200);
		for(int i=0;i<10;i++) {
			skills[i] = 5000 + random;//데미지 설정
		}
	}
}

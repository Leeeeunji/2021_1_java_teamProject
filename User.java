import java.io.Serializable;
public class User implements Serializable {
	private String id; //아이디
	private double score;	//학점
	public User() {
		score = 0.0;
		id = "";
	}
	public User(double theNumber, String theLetter) {
		score = theNumber;
		id = theLetter;
	}
	public String toString() {
		return "id : " + score
				+ " score : " + id;
	}
}

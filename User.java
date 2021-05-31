import java.io.Serializable;
public class User implements Serializable {
	private String id; //¾ÆÀÌµð
	private double score;	//ÇÐÁ¡
	public User() {
		score = 0.0;
		id = "";
	}
	public User(double theNumber, String theLetter) {
		score = theNumber;
		id = theLetter;
	}
	public String toString() {
		return "score : " + score
				+ " id : " + id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
}
package tammen.tuesday;

/**
 * Created by tammen on 27/02/15.
 */
public class Challenge {
	   
	String name;
	int score;
	int pointWeight;

	public Challenge(int pW, String n) {
		this.name = n;
		this.score = 0;
		this.pointWeight = pW;
    }

    int calculatePoints() {
		return score * pointWeight;
    }

    
}

import java.util.Random;

public class WK3CodingProb13 {
	public static void main(String[] args) {
		Random diceRoll = new Random();
		int d = diceRoll.nextInt(6) + 1;
		System.out.println("You rolled a " + d +".");
	}
}

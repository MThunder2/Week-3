
public class WK3CodingProb12 {
	public static void main(String[] args) {
		System.out.println(willBuyDrink(true, 13.00));

	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
}
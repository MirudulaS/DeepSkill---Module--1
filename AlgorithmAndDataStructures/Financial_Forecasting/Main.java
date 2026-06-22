
public class Main {
	public static void main(String[] args) {
		Finance finance = new Finance(10000, 1.10, 3);
		double amount = finance.recursion(10000,1.10,3);
		System.out.printf("Future Predicted Value: %.2f", amount);
	}
}


public class TestSingleton {
	public static void main(String[] arg) {
		Logger log1;
		Logger log2;
		log1 = Logger.getInstance();
		log2 = Logger.getInstance();
		//Ensures that both uses the same instance of the class
		if(log1==log2) {
			System.out.println("Singleton Pattern");
		}
		//Logger
		log1.message("log1: Application Started");
		log2.message("log2: Transaction Completed");
	}
}

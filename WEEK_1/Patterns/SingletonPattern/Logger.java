
public class Logger {
	public static Logger instance;
	//private constructor for avoiding the creation of the object from outside
	private Logger(){
		
	}
	public static Logger getInstance() {
		if(instance==null) {
			instance = new Logger();
		}
		return instance;
	}
	public void message(String str) {
		System.out.println(str);
	}
}

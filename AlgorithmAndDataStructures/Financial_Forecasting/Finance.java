
public class Finance {
	int current;
	double growthrate;
	int years;
	Finance(int current, double growthrate, int years){
		this.current = current;
		this.growthrate = growthrate;
		this.years = years;
//		System.out.print(years);
	}
	// Used recursion to find the future financial value
	public double recursion(int current, double growthrate, int years) {
		if(years==0) {
			return current;
		}
		return growthrate*recursion(current, growthrate, years-1);
	}
}

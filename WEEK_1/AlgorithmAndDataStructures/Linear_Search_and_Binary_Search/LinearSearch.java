
public class LinearSearch {
	public static boolean linearsearch(Product pro[], int id) {
		for(Product p : pro) {
			if(p.productId==id) {
				return true;
			}
		}
		return false;
	}
}

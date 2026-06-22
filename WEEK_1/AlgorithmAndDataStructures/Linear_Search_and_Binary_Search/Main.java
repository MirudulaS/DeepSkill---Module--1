
public class Main {
	public static void main(String [] args) {
		Product[] pro = {
				new Product(101, "Mobile", "Electronics"),
				new Product(102, "Laptop", "Electronics"),
				new Product(103, "Smart Watch", "Electronics"),
				new Product(104, "Shoes", "Fashion"),
				new Product(105, "Watch", "Accessories"),
				new Product(106, "Chain", "Accessories")
		};
		boolean checklinear = LinearSearch.linearsearch(pro, 105);
		boolean checkbinary = BinarySearch.binarysearch(pro, 105);
		
		if(checklinear) {
			System.out.println("Element Found in Linear Search!!");
		}else if(!checklinear){
			System.out.println("Element Not found in Linear Search!!");
		}
		
		if(checkbinary) {
			System.out.print("Element Found in Binary Search!!");
		}
		else if(!checkbinary) {
			System.out.print("Element Not Found in Binary Search!!");
		}
	}
}

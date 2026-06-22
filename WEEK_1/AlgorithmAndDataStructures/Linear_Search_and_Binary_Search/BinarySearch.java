
public class BinarySearch {
	public static boolean binarysearch(Product[] pro, int id) {
		int left = 0;
		int right = pro.length;
		while(left<=right) {
			int mid = (left+right)/2;
			if(pro[mid].productId==id) {
				return true;
			}
			else if(pro[mid].productId>id) {
				right=mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return false;
	}
}

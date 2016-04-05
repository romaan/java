package rk_java;

/*
 * BinarySearch: Takes sorted strings as input
 * and returns the position of the result if found
 */
public class BinarySearch {
	
	private String[] data;
	
	public BinarySearch(String[] data) {
		this.data = data;
	}
	
	/*
	 * position: Given a key, return the index if found else -1
	 */
	public int position(String key) {
		int start = 0, end = this.data.length - 1;
		while (start <= end) {
			int mid = (int)((start + end) / 2);
			if (this.data[mid].compareTo(key) == 0) {
				return mid;
			} else if (this.data[mid].compareTo(key) > 0) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}	
}

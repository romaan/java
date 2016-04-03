package rk_java;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
	
	@Test
	public void testMatchSearch() {
		String[] data = {"Apple", "Bat", "Cat", "Kite", "Lion", "Mango", "Monitor", "Ziraffee"};
		BinarySearch biSearch = new BinarySearch(data);		
		Assert.assertEquals(1, biSearch.position("Bat"));
	}
	
	@Test
	public void testNoMatchSearch() {
		String[] data = {"Apple", "Bat", "Cat", "Kite", "Lion", "Mango", "Monitor", "Ziraffee"};
		BinarySearch biSearch = new BinarySearch(data);
		Assert.assertEquals(-1, biSearch.position("No Key"));
	}

}

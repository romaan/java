package numbers;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class PrimeGeneratorTest {

	@Test
	public void testPrimeNumber() {
		ArrayList<Integer> aList = new PrimeGenerator(10).get_list();
		System.out.println(aList.toArray());
		Assert.assertArrayEquals(aList.toArray(), new Integer[] {2, 3, 5, 7});
	}
	
}

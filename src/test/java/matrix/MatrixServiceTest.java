package matrix;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MatrixServiceTest {
	
	@Test
	public void testMatrixAdd()  throws InvalidDimensionException  {		
		// #NOTE: How 2d arrays are initialized
		MatrixService m1 = new Matrix(3, 2, new Float[][]{{1f,1f}, {2f,2f}, {3f,3f}});
		MatrixService m2 = new Matrix(3, 2, new Float[][]{{1f,1f}, {2f,2f}, {3f,3f}});
		MatrixService m3 = m1.add(m2);
		Float [][] m4 = new Float[][] {{2f,2f}, {4f,4f}, {6f,6f}};
		// #Note: 2d array comparison
		Assert.assertTrue(Arrays.deepEquals(m3.getMatrix(), m4));
	}
	
	@Test
	public void testMatrixSubtract() throws InvalidDimensionException {		
		MatrixService m1 = new Matrix(3, 2, new Float[][]{{1f,1f}, {2f,2f}, {3f,3f}});
		MatrixService m2 = new Matrix(3, 2, new Float[][]{{1f,1f}, {2f,2f}, {3f,3f}});	
		MatrixService m3 = m1.subtract(m2);
		Float [][] m4 = new Float[][] {{0f,0f}, {0f,0f}, {0f,0f}};
		Assert.assertTrue(Arrays.deepEquals(m3.getMatrix(), m4));
	}
	
	@Test
	public void testMatrixMultiply()  throws InvalidDimensionException  {		
		MatrixService m1 = new Matrix(3, 2, new Float[][]{{1f,1f}, {2f,2f}, {3f,3f}});
		MatrixService m2 = new Matrix(2, 3, new Float[][]{{1f,1f,1f}, {2f,2f,2f}});
		MatrixService m3 = m1.multiply(m2);
		Float [][] m4 = new Float[][] {{3f,3f,3f}, {6f,6f,6f}, {9f,9f,9f}};
		Assert.assertTrue(Arrays.deepEquals(m3.getMatrix(), m4));
	}
	
	@Test(expected=InvalidDimensionException.class)
	public void testMatrixMultiplyException()  throws InvalidDimensionException  {		
		MatrixService m1 = new Matrix(3, 3, new Float[][]{{1f,1f,1f}, {2f,2f,2f}, {3f,3f,3f}});
		MatrixService m2 = new Matrix(2, 3, new Float[][]{{1f,1f,1f}, {2f,2f,2f}});
		m1.multiply(m2);		
	}

	@Test
	public void testrotate()  throws InvalidDimensionException  {		
		MatrixService m1 = new Matrix(4, 4, new Float[][]{{1f,2f,3f,4f}, {5f,6f,7f,8f}, {9f,10f,11f, 12f}, {13f, 14f, 15f, 16f}});
		Float[][] f_expect = new Float[][]{{13f, 9f, 5f, 1f}, {14f, 10f, 6f, 2f}, {15f, 11f, 7f, 3f}, {16f, 12f, 8f, 4f}};
		m1.rotate();
		System.out.println(m1.getMatrix());
		Assert.assertTrue(Arrays.deepEquals(m1.getMatrix(), f_expect));
	}
	
}

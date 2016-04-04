package matrix;

/* 
 * MatrixService: Offers services of performing various matrix operations
 */
public interface MatrixService {
	// #Note: Interface methods are implicitly public and abstract
	// #Note: Interface variables are implicitly static and final
	public MatrixService add(MatrixService aMatrix) throws InvalidDimensionException;
	public MatrixService subtract(MatrixService aMatrix) throws InvalidDimensionException;
	public MatrixService multiply(MatrixService aMatrix) throws InvalidDimensionException;
	public void rotate() throws InvalidDimensionException ;
	public MatrixService transpose();
	// Return the Matrix data
	public Float[][] getMatrix();
	// Return the X dimension
	public int getDimX();
	// Return the Y dimension
	public int getDimY();
}

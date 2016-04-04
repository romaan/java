package matrix;

/* 
 * Matrix: Implement MatrixService operations
 */
public class Matrix implements MatrixService {
	
	private Float [][] data;
	private final int dimX;
	private final int dimY;
	
	// # Note: Defining constructor removes default constructor. Hence if default constructor (constructor with no args) is needed, it should be defined explicitly
	
	/*
	 * Constructor to initialize an empty data
	 */
	public Matrix(int dimX, int dimY) {
		this.dimX = dimX;
		this.dimY = dimY;
		this.data = new Float[dimX][dimY];
	}
	
	/*
	 * Constructor to initialize an assigned data
	 */
	public Matrix(int dimX, int dimY, Float [][] data) {
		this.data = data;
		this.dimX = dimX;
		this.dimY = dimY;
	}

	@Override
	public MatrixService add(MatrixService aMatrix)  throws InvalidDimensionException {
		if (this.getDimX() != aMatrix.getDimX() || this.getDimY() != aMatrix.getDimY())
			throw new InvalidDimensionException();
		Matrix result = new Matrix(this.getDimX(), this.getDimY());
		for (int i = 0; i < this.getDimX(); i++)
			for (int j = 0; j < this.getDimY(); j++)
				result.data[i][j] = this.data[i][j] + ((Matrix) aMatrix).data[i][j];
		return result;
	}

	@Override
	public MatrixService subtract(MatrixService aMatrix) throws InvalidDimensionException {
		if (this.getDimX() != aMatrix.getDimX() || this.getDimY() != aMatrix.getDimY())
			throw new InvalidDimensionException();
		Matrix result = new Matrix(this.getDimX(), this.getDimY());
		for (int i = 0; i < this.getDimX(); i++)
			for (int j = 0; j < this.getDimY(); j++)
				result.data[i][j] = this.data[i][j] - ((Matrix) aMatrix).data[i][j];
		return result;
	}

	@Override
	public MatrixService multiply(MatrixService aMatrix) throws InvalidDimensionException {
		if (this.getDimY() != aMatrix.getDimX())
			throw new InvalidDimensionException();
		Matrix result = new Matrix(this.getDimX(), aMatrix.getDimY());
		// Multiply the matrix
		for (int i = 0; i < this.getDimX(); i++) {
			for (int j = 0; j < aMatrix.getDimY(); j++) { // common dimension across this and aMatrix
				result.data[i][j] = 0f;
				for (int k = 0; k < this.getDimY(); k++)
				{				
					result.data[i][j] += this.data[i][k] * ((Matrix) aMatrix).data[k][j];
				}				
			}			
		}
		return result;
	}

	@Override
	public void rotate() throws InvalidDimensionException {
		if (this.getDimY() != this.getDimX())
			throw new InvalidDimensionException("Invalid dimension: Expecting a square matrix only");
		
		for (int i = 0; i < this.getDimX()/2; i++) {	// Start from outer and go inner
			for (int j = 0; j < this.getDimX() - 1; j++) {
				Float temp1 = this.data[i][j];
				swap(temp1, this.data[j][this.getDimX() - i - 1]); //2
				swap(temp1, this.data[this.getDimX() - i - 1][this.getDimX() - j - 1]); // 3
				swap(temp1, this.data[this.getDimX() - j - 1][i]); // 4
				swap(temp1, this.data[i][j]);
			}
		}		
	}

	@Override
	public MatrixService transpose() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float[][] getMatrix() {		
		return this.data;
	}
	
	@Override
	public int getDimX() {
		return dimX;
	}
	
	@Override
	public int getDimY() {
		return dimY;
	}
	
	private void swap(Float a, Float b) {
		float temp = a;
		a = b;
		b = temp;
	}	
}

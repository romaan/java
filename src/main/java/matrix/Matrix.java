package matrix;

public class Matrix implements MatrixService {
	
	private float [][] data;
	private int dimX;
	private int dimY;
	
	public int getDimX() {
		return dimX;
	}
	
	public int getDimY() {
		return dimY;
	}
	
	public Matrix(int dimX, int dimY) {
		this.dimX = dimX;
		this.dimY = dimY;
		this.data = new float[dimX][dimY];
	}
	
	public Matrix(int dimX, int dimY, float [][] data) {
		this.data = data;
		this.dimX = dimX;
		this.dimY = dimY;
	}

	@Override
	public MatrixService add(MatrixService aMatrix) {
		Matrix result = new Matrix(this.getDimX(), this.getDimY());
		for (int i = 0; i < ((Matrix) aMatrix).getDimX(); i++)
			for (int j = 0; j < ((Matrix) aMatrix).getDimY(); j++)
				result.data[i][j] = this.data[i][j] + aMatrix.data[i][j];
		return result;
	}

	@Override
	public MatrixService subtract(MatrixService aMatrix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrixService multiply(MatrixService aMatrix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrixService rotate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrixService transpose() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

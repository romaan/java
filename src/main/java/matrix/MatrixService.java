package matrix;

public interface MatrixService {
	public MatrixService add(MatrixService aMatrix);
	public MatrixService subtract(MatrixService aMatrix);
	public MatrixService multiply(MatrixService aMatrix);
	public MatrixService rotate();
	public MatrixService transpose();
}

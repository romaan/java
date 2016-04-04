package matrix;

public class InvalidDimensionException extends Exception {
	
	public InvalidDimensionException() {
		super("Invalid dimensions to perform the operation");
	}
	
	public InvalidDimensionException(String message) {
		super(message);
	}

}

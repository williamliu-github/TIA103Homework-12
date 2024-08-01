package hw6;

public class CalException extends Throwable {
    private static final long serialVersionUID = 1L;
	public CalException() {};    
	public CalException(String message) {
		super(message);
        	
        };
}

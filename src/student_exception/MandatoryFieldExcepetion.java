package student_exception;

public class MandatoryFieldExcepetion extends RuntimeException{
	private static String errorMessage;
	public MandatoryFieldExcepetion() {
	super(errorMessage);
	this.errorMessage=errorMessage;
	}

}

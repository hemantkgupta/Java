public class CustomExceptionTest {

	public static void main(String[] args) {
		try {
			// new CustomExceptionTest().simple();
			new CustomExceptionTest().withMessage();
		} catch (MyException e) {
			System.out.println("test");
			e.printStackTrace();
		}
	}

	public void simple() throws MyException {
		throw new MyException();
	}

	public void withMessage() throws MyException {
		throw new MyException("Some message");
	}

}

class MyException extends Exception {

	MyException() {
	}

	MyException(String msg) {
		super(msg);
	}

}
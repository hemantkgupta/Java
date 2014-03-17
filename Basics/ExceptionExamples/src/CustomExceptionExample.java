public class CustomExceptionExample {

	public static void main(String[] args) {
		try
	      {
	         new  CustomExceptionExample().test();
	      }catch(MyException e)
	      {
	         System.out.println("test");
	         e.printStackTrace();
	      }
	}
	
	public void test() throws MyException{
		throw new MyException();
	}

}

class MyException extends Exception{
}
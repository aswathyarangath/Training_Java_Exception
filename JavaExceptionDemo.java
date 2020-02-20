public class JavaExceptionDemo{
	public static void main(String args[]){
		try{
			int data=23/0;
		}	
		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		System.out.println("rest of code.....");
	}
}
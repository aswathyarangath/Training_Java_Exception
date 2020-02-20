import java.io.*;
class A{
	void method() throws IOException{
		throw new IOException("device error");
	}
}
public class ThrowsDemo2{
	public static void main(String args[]) throws IOException{
		
			A obj=new A();
			obj.method();
		
	System.out.println("further process");
	}
}
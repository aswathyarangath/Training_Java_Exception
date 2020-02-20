import java.io.*;
class A{
	void method() throws IOException{
		throw new IOException("device error");
	}
}
public class ThrowsDemo1{
	public static void main(String args[]){
		try{
			A obj=new A();
			obj.method();
		}catch(Exception e){
	System.out.println("exception handled");}
	System.out.println("further process");
	}
}
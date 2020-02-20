import java.io.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
	super(s);
	}
}
class CustomEx{
	static void validate(int age)throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not eligible");
		else
			System.out.println("Bank account is opened");
	}
	public static void main(String args[]){
		try{
		validate(13);
		}catch(Exception e){
			System.out.println("Exception occured."+e);
			}
		System.out.println("further process");
	}
}
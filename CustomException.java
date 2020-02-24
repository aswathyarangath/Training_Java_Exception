package com.exception;

public class CustomException extends RuntimeException{
String msg;
public CustomException(String msg){
	super();
	this.msg=msg;
}
public String getMessage(){
	return msg;
}
}
class Age{
	static void validate(int age)throws CustomException{
		if(age<18)
			throw new CustomException("not eligible");
	}

	public static void main(String[] args){
		validate(13);
}
}


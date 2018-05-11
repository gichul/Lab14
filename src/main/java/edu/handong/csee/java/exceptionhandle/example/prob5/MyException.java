package edu.handong.csee.java.exceptionhandle.example.prob5; //package name

public class MyException extends Exception { //MyException class extends Exception 
	private String message = null;		//declare message by private

	public MyException() {   //constructor
		super();		//receive error message
	}

	public MyException(String message) {		//MyException Constructor
		super(message);		//receive error message
		this.message = message;		//return the data
	}

	public MyException(Throwable cause) {	//MyException Constructor
		super(cause);		//receive error message
	}

	public String toString() {		//Override the toString() method of Exception
		return message;			//return String message
	}
}

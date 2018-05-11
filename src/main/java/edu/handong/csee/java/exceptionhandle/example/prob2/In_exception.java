package edu.handong.csee.java.exceptionhandle.example.prob2; //package name

import java.util.Scanner;		//import Scanner Class to use keyboard
import java.util.InputMismatchException;  //import InputMismatchException class to check exception 

public class In_exception {	//declare In_exception
	private int x,y,result;	//declare private type int variable x,y
	
	public In_exception() { //default constructor
		
	}

	public void exception() {		//exception method to check exception
		Scanner keyboard=new Scanner(System.in);		//instantiation of Scanner class
		try {		//try statement to check whether there is error
			System.out.println("x : ");		//print this statement on console
			x=keyboard.nextInt();		//in x input data
			System.out.println("y : ");	//print this statement on console
			y=keyboard.nextInt();	//in x input data
			result=x/y;	//calculates the results
			System.out.println(result); // print the result on console
		}	
		catch(InputMismatchException e) {		//if there is a ArithmeticException exists make the instance and deliver it
			System.out.println("java.util.InoutMismatchException");		//print this statement on console
		}
		catch(ArithmeticException e) { //if there is a ArithmeticException exists make the instance and deliver it
			System.out.println("java.lang.ArithmeticException"+e.getMessage());//print this statement on console
		}
	}
	
}

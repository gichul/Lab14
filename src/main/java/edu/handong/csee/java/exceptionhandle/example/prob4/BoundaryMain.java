package edu.handong.csee.java.exceptionhandle.example.prob4; //package name
import java.util.Scanner; //Scanner class to use keyboard

public class BoundaryMain { //BoundaryMain class

	public static void main(String[] args) {	//main method
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);	//instantiation of Scanner class
		
		Boundary array=new Boundary();		//instantiation of Boundary class
		try {				//try statement
			for(int i=0;i<=array.getArr().length;i++) {	//for statement to input data
				System.out.printf("Enter an integer : ");  //print the "" on console
				array.getArr()[i]=keyboard.nextInt(); //input the data into array.getArr()[i]
				System.out.println("arr["+i+"]"+"<-"+array.getArr()[i] ); //print this on console

			}
		}catch(Exception e) {   //catch statement if there is ArrayIndenOutOfBoundsException.
			System.out.println("Invalid array index access!"); //print this on console 
		}

	}

}

package edu.handong.csee.java.exceptionhandle.example.prob3;  //package name

import java.util.Scanner;  //import Scanner class to use keyboard

public class PowercalcMain { //declare PowercalcMain class

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub

		Powercalc my_calculator=new Powercalc();	//instantiation of Powercalc class
		int n,p;		//instance variable

		Scanner keyboard=new Scanner(System.in); //instantiation of Scanner class
		while(keyboard.hasNextInt()) {		//while statement using hasNextInt()instance

			n=keyboard.nextInt(); //input int type data into n
			p=keyboard.nextInt(); //input int type data into p

			try {						//try statement to use Exception
				System.out.println(my_calculator.power(n, p)); //call the method power and print on console
			}catch(Exception e) {		//catch statement receiving the instance
				System.out.println(e);		//
			}
		}

	}

}

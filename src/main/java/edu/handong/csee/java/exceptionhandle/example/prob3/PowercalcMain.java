package edu.handong.csee.java.exceptionhandle.example.prob3;

import java.util.Scanner;

public class PowercalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Powercalc my_calculator=new Powercalc();
		int n,p;

		Scanner keyboard=new Scanner(System.in);
		while(keyboard.hasNextInt()) {

			n=keyboard.nextInt();
			p=keyboard.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			}catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}

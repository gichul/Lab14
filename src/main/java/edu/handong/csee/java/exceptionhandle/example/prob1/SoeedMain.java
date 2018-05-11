package edu.handong.csee.java.exceptionhandle.example.prob1; //package name 

import java.util.Scanner;	//import Scanner to use Scanner class
import java.util.Random;	//import Random to use Random class 

public class SoeedMain {	//declare main class

	public static void main(String[] args) {		//declare main method
	
		System.out.printf("Set the speed limit, officer : ");	//print this ""line on console
		
		Scanner keyboard=new Scanner(System.in);	//instantiation to use keyboard
		Random rand=new Random();			//instantiation to use Random number
		int limit=keyboard.nextInt();		//declare limit and input data from keyboard 
		int speed=rand.nextInt(100);		//declare speed and input data 0~100
		
		SpeedLimitter speed1=new SpeedLimitter(limit,speed);	//In constructor input the data
		speed1.warnSpeedLimit();	//call warnSpeedLimit method
		
	
	}
}

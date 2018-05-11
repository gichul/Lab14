package edu.handong.csee.java.exceptionhandle.example.prob6; //package name
import java.util.Scanner; //import Scanner class 

public class CustomIDMain {		//CustomIDMain class

	public static void main(String[] args) {	//static main method
		// TODO Auto-generated method stub
		String name, race;		//declare String name & race
		int age = 0;		//declare instance variable
		Scanner keyboard = new Scanner(System.in);		//instantiation to use keyboard
		CustomID obj = new CustomID();		//instantiation of CustomID
		boolean repeat = true;		//declare boolean type instance variable

		while(repeat)		//while statement
		{
			try {		//try statement
				if(obj.getState() == 0) {	//compare the value of CustomID`s instance variable state
					System.out.print("Enter your name: ");//print this line on console
					name = keyboard.nextLine();	//input the data from keyboard
					obj.set_name(name);		//input the name String into set_name method
				}
				else if(obj.getState() == 1) {	//compare the value of CustomID`s instance variable state
					System.out.print("Enter your age: ");////print on console
					age = keyboard.nextInt(); //input data from keyboard
					
					obj.set_age(age);	//input the age into age method
				}


				else if(obj.getState() == 2) {	//compare the value of CustomID`s instance variable state
					System.out.print("Enter your race: "); //print on console
					race = keyboard.nextLine(); //input data from keyboard
					keyboard.nextLine(); //to remove NULL character 
					obj.set_race(race);  //input the race String into race method
				}
			}
			catch(Exception e){ //catch statement checking Exception 
				System.out.println(e.getMessage()); //print the error receiving from CustomID String
				continue; //back to beginning
			}
		}

	}


}

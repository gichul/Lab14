package edu.handong.csee.java.exceptionhandle.example.prob6; //package name

public class CustomID extends Exception{ //class CustomID extends Exception
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"}; //declare the three races to distinguish
	private String name = ""; 	//declare String name
	private int age = 0;		//declare int age
	private String race = "";		//declare String race
	private int state = 0;		//declare int state

	public void set_name(String str) throws Exception  //set_name  throws Exception
	{
		if(str.length() < 5) { //if statement to check the length of str
			state = 0;		//use state variable
			throw new Exception("Your name is short! Try again!");  //print the result on console
		}
		
		else {		//else statement 
			this.name =str;	 //input the str into name instance variable
			System.out.println("Name is valid"); //print this on console
			System.out.println("Name: " + name);		//print this on console
			state++; //if the if statement is true return 0, if not return 1
		}
	}



	public void set_age(int num) throws Exception//set_age  throws Exception
	{
		if(num < 18) {//if statement to check the length of num
			state = 1;	//if the statement is true statement is 1
			throw new Exception("You are too young! Try again!");  //making instance and throw the String
		}
		else {		//else statement
			this.age = num;		//input the num into age instance variable
			System.out.println("Age is valid");	//print on console
			System.out.println("Age: " + this.age);	//print on console
			state++;	//if the if statement is true return 0, if not return 1
		}
	}

	public void set_race(String race) throws Exception{//set_race  throws Exception
		for(int i = 0; i < races.length; i++) //for statement to check equality of races alphabet
		{
			if(races[i].equals(race)) {  //if statement comparing
				this.race = races[i];  //input the data from races into race
				System.out.println("Race is valid"); //print the line on console
				System.out.println("Race: " + races[i]);//print the races[i]on console
				state = 0;  //if the statement is true return 0
				return; //return the value
			}
		}
		state = 2;	//if the if statement is true return 2
		throw new Exception("Human! Try again."); //making instance and throw the String
	}
	public int getState() //getState method to return value
	{
		return state; // return value
	}
}

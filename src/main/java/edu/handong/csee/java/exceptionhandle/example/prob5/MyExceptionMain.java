package edu.handong.csee.java.exceptionhandle.example.prob5; //package name

import java.util.Scanner; //Scanner class to use keyboard

public class MyExceptionMain {  //MyExceptoinMain class
    public static void main(String[] a){ //main method 
        try{ 		//try statement
        Scanner keyboard = new Scanner(System.in); //instantiation to use keyboard
        String str = keyboard.nextLine();	//input the data to str
        MyExceptionMain.myTest(str);  //approach to static method by str
        } catch(MyException mae){ 	//catch statement when in myTest there is error  
            System.out.println("Inside catch block: " + mae);	//print the String 
        }
    }
     
    static void myTest(String str) throws MyException{ //static method throws MyException
        if(str.equals("null")){ 	//if str is equal to "null" executes next line 
            throw new MyException("String val is null");	 //instantiation 
        }
        else 	//else statement
        System.out.println("String val is:" + str); 	//print the " " and str
    }
}
 

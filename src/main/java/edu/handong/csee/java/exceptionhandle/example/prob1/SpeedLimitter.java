package edu.handong.csee.java.exceptionhandle.example.prob1;//package name

public class SpeedLimitter {		//declare SpeedLimiter class 
	private int speed;			//declare instance variable speed
	private int limit;			//declare instance variable limit
	
	public SpeedLimitter(int limit,int speed) {		//declare constructor
		this.speed=speed;				//initiation of this.speed
		this.limit=limit;				//initiation of this.limit
		
	}
	
	void warnSpeedLimit(){		//declare warnSpeedLimit method
		try {		//declare try&catch statement
			if(this.speed>this.limit) {		//compare to make exception
				throw new Exception();  //if the upper statement true call the Exception() 
			}
			else { //if the 'if'statement is false executes this statement
				System.out.println("You are a law abiding citizen!"); // print this statement on console
				
			}
			
			
		}
		catch(Exception e) {		//When the Exception occurred call this catch statement.
			System.out.println("speed limit is "+this.limit+"km !"); //print this line on console
			System.out.println("you are being fined"); //print this line on console
		}
		System.out.println("Your current Speed : "+this.speed); 		//print the current Speed on console 
	}
	
}


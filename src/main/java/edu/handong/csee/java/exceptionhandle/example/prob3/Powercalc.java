package edu.handong.csee.java.exceptionhandle.example.prob3;	//package name


public class Powercalc {		//Powercalc class

	
	public Powercalc() {		//constructor
	
	}
	
	public long power(int n,int p) throws Exception { 	//power method throws Exception
		long result = 0;		//long type variable result
		
		result=(long)Math(n,p);		//input the data n,p and calculate square 
		if(n<0||p<0) {			//if n&p<0 
			throw new Exception("n or p should not be negative"); //make the instance and using throw represent Exception
		}
		if(n==0&&p==0) {  //if n==0&&p==0
			throw new Exception("n and p should not be zero"); //make the instance and using throw represent Exception
		}
		return result; //return the square value of result
	}

	
	
	
	private long Math(int n, int p) {  //Math method
		// TODO Auto-generated method stub
		long square=1;			//long type variable square
		for(int i=0; i<p;i++) {  //for statement to * as p numbers
		square*=n;		//calculates square value
		}
		return square;		//return data to result  
	}
	
	
}

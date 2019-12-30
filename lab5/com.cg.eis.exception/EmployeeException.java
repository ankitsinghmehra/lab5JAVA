package com.cg.eis.exception;

public class EmployeeException extends Exception{
	public  EmployeeException() {
		
	}
		
	
	@Override
	public String toString(){
		return "Salary Exception(less than 3000)";
		
	}

}
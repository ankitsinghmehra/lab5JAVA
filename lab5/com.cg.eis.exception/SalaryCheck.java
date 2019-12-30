package com.cg.eis.exception;

import java.util.Scanner;

public class SalaryCheck {
	public static void main(String[] args){
		try{
			int sal;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter salary:");
			sal=sc.nextInt();
			if(sal>3000)
				System.out.println("valid salary");
			else
				throw new EmployeeException();
				
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}

}

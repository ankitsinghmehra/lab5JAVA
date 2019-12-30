package lab5;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) throws AgeException{
		try{
			int age;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age:");
			age=sc.nextInt();
			if(age>15)
				System.out.println("valid age");
			else
				throw new AgeException();
				
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}

}

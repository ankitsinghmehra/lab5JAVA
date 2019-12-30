package lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {

	public static boolean validateName(String txt){
		String regx = "^[\\p{L} .'-]+$";
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(txt);
	    return matcher.find();
	}
	public static void main(String[] args) throws EmptyNameException{
		try{
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("Enter name:");
		a=sc.next();
		
		if(!a.equals("")){
			if(validateName(a)==true)
				System.out.println("Validated");
			else
				System.out.println("Invalid!!!");
			throw new EmptyNameException();
		}
		else
			throw new EmptyNameException();
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
}

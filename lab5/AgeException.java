package lab5;

public class AgeException extends Exception{
	public AgeException(){
		
	}
	@Override
	public String toString(){
		return "Age Exception(less than 15)";
		
	}

}

package lab5;


public class EmptyNameException extends Exception{

	public EmptyNameException(){
	}
	@Override
	public String toString() {
		return "EmptyNameException(wrong value entered!!!)";
		
	}

	
}

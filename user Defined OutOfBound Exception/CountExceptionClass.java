package exceptionPrac;

public class CountExceptionClass extends Exception{

	String msg;
	public CountExceptionClass(String msg){
		this.msg=msg;
	}
	public CountExceptionClass(){
		
	}
	public String toString(){
		return msg==null?"get lost!!":msg;
		
	}
}

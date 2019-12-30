package lab1;
import java.util.Arrays;

public class EmplApp {
	
	public static void main(String[] args){
		Empl[] e=new Empl[3];
		e[0]=new Empl(101,"boom","baam");
		e[1]=new Empl(102,"doom","daam");
		e[2]=new Empl(103,"loom","laam");
		
		Arrays.sort(e);
		for(int i=0;i<e.length;i++)
			System.out.println(e[i]);
		
		
		
	}
}

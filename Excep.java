/*java program for array out of bound exception*/

package exceptionPrac;
import java.lang.Exception;
import java.util.*;

public class Excep{

	int id;
	String name;
	Excep[] emp=new Excep[4];
	static Excep em=new Excep();
	static Scanner sc=new Scanner(System.in);
	public Excep(int id,String name){
		this.id=id;
		this.name=name;
	}
	public Excep(){
		
	}
	public void addMem() throws ArrayIndexOutOfBoundsException{
		
		for(int i=0;i<emp.length;i++){
			if(emp[i]==null){
				emp[i]=new Excep(id,name);
				return;
			}
		}
		throw new ArrayIndexOutOfBoundsException("get lost!!");
			
	}
		
	
	
	public static void main(String[] args){
		try{
			while(true){
			System.out.println("Enter id:");
			em.id=sc.nextInt();
			if(em.id==0){
				break;
			}
			System.out.println("Enter name:");
			em.name=sc.next();
			em.addMem();
		}
		}
		catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}
	}
	
}

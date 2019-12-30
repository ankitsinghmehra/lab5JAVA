package new12_18_19;
import java.util.Arrays;

import lab1.Empl;

public class Empapp {

	public static void main(String[] args){
		Empl[] emp=new Empl[3];
		emp[0]=new Empl(1001, "abhishek", "manager");
		emp[1]=new Empl(1002, "chitransh", "sales");
		emp[2]=new Empl(1003, "deepak", "truckdriver");
		
		System.out.println("====================");
		System.out.println("Student List Sorted By Name");
		Arrays.sort(emp);
		for(int i=0;i<emp.length;i++)
			System.out.println(emp[i]);
		System.out.println("====================");
		System.out.println("Student List Sorted By RollNo");
		
		CompareByID id=new CompareByID();
		
		Arrays.sort(emp,id);
		
		for(int i=0;i<emp.length;i++)
			System.out.println(emp[i]);
		
		System.out.println("====================");
		System.out.println("Student List Sorted By Stream");
		
		CompareByDesignation s=new CompareByDesignation();
		
		Arrays.sort(emp,s);
		
		for(int i=0;i<emp.length;i++)
			System.out.println(emp[i]);
	}
}

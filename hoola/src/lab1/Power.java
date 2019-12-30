package lab1;
import java.util.*;

public class Power {

	public static void checkNumb(int x){
		int n=x;
		int a=1;
		for(int i=0;i<=n;i++){
			a=a*2;
			if(a==n)
				break;
		}
		if(a==n)
			System.out.println("it is");
		else
			System.out.println("it is not");
	}
	public static void main(String[] args){
		int n;
		System.out.println("Enter num to check:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		checkNumb(n);
	}
}

package lab1;
import java.util.*;

public class Increa {
		public static void checkNum(int x){
			int n=x;
			int a,b;
			while(n>0){
				a=n%10;
				n=n/10;
				b=n%10;
				if(a>b)
					continue;
				else
					break;
			}
			if(n==0){
				System.out.println("increasing");
			}
			else
				System.out.println("decreasing");
		}
	public static void main(String[] args){
		int n;
		System.out.println("Enter number to check:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	    checkNum(n);
	}
}

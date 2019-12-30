package lab1;
import java.util.*;

public class Differ {

	public static int calculateDifference(int x){
		int n=x;
		int sum1=0,sum2=0;
		for(int i=0;i<=n;i++){
			sum1=sum1+(i*i);
			sum2=sum2+i;
		}
		return sum1-(sum2*sum2);
	}
	public static void main(String[] args){
		int n;
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(calculateDifference(n));
	}
}

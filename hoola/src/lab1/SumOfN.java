package lab1;
import java.util.*;

public class SumOfN {
	public static int calculateSum(int x){
		int n=x;
		int sum=0;
		for(int i=0;i<=n;i++){
			if(i%3==0||i%5==0){
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		System.out.println(calculateSum(n));
	}

}

package number;
/*
 * wap to check whether a number is perfect number
 * 6- 1+2+3=6
 * 28-1+2+4+7+14=28
 * o/p 28
 * perfect number
 * 
 */
import java.util.Scanner;
public class n24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int sum=0;
		for(int i=1;i<num/2;i++) {
			if(num%i==0)
			{
				sum+=i;
			}
		}
		
		if(num==sum)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println(" not a perfect number");
		}

	}

}

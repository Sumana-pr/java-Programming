package number;
/*
 * wap to check whether a number is neon number(only 0 1 & 9)
 * 1-1
 * 9-81=8+1=9
 * 8-64=6+4=10
 * o/p  1
       neon number
   o/p  5
       not a neon number
 */

import java.util.Scanner;
public class n22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int sqr=num*num;
		int sum=0;
		int remainder;
		while(sqr>0)
		{
			remainder=sqr%10;
			sum+=remainder;
			sqr/=10;
		}
		
		if(num==sum)
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println(" not a neon number");
		}

	}

}

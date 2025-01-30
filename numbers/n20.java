package number;
/*
 * wap to check whether a number is automorphic number(25|36|625|5776 // these are automorphic numbers
 *                                                      5|6|25|76)
 * 
 * 5
   ita a automorphic number
   
 enter the number
13
its not a automorphic number

 */
import java.util.Scanner;
public class n20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sqr=num*num;
		boolean flag=true;
		
		while(temp>0)
		{
			if(sqr%10!=temp%10)
			{
				flag=false;
				break;
			}
			sqr=sqr/10;
			temp=temp/10;
		}
		if(flag)
		{
			System.out.println("ita a automorphic number");
		}
		else
		{
		System.out.println("its not a automorphic number");
		}
}
}


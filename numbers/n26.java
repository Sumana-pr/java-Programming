package number;
/*
 * wap to check whether emirp number or reverese of prime number
 * 17-71 =prime
 * 13-31=prime
 * 23-32=not a emirp
 * o/p 17 is a emirp
 * 10 is not a emirp
 */

import java.util.Scanner;

public class n26 {

	public static int reverse(int num) {
		int temp = num;
		int remainder ;
		int reverse = 0;
			 while (temp >0) {
					remainder = temp % 10;
					reverse = reverse * 10 + remainder;
					temp = temp / 10;
		      }
			 return reverse;
	}
			 public static boolean isprime(int num)
			 {
				 boolean flag=true;
				 for(int i=2;i<num/2;i++) {
			         if(num%i==0)
		             {
			           flag = false;
			           break;

		             }
				 }
				 return flag;
			 }
				 public static void main(String[] args) {
					 Scanner sc=new Scanner(System.in);                  
				        System.out.println("enter the number");
				           int num=sc.nextInt();
					if(isprime(num))
					{
						int reverse = reverse(num);
						if(isprime(reverse)) {
							System.out.println(num+" is a emirp");
						}
						else {
							System.out.println(num+"is not a emirp");
						}
					}
					else
					{
						System.out.println(num+"is not a emirp");
					}
						
			

}
}


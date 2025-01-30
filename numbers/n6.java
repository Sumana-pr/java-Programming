package number;

import java.util.Scanner;

/*
 * wap to count a number of digit      import java.util.Scanner;
 *   43567                             //Scanner sc=new Scanner(System.in);
 *  digit = 5                          // s.o.pln("enter the number");
 *                                     // int num=sc.nextInt();
 *                                     //int digits=0;
 *                                     while(num>0)
 *                                     digits++;
 *                                     num=num/10;
 *                                     s.o.pln("digits="+digits);
 */
public class n6 {

	public static void main(String[] args) {      
                                
		int num=435678;
		int digit=0;
		while(num>0)
		{
			
			num=num/10;
			digit++;
		}
		System.out.println(digit);
}
}

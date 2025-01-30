package number;
/*
 * wap to reverse a number
 * enter the number
   365
the reverse no is=563

 */
import java.util.Scanner;
public class n10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
        int num=sc.nextInt();
        int temp = num;
        int remainder=0;
        int reverse=0;
	      while(temp>0) {
	    	  remainder=temp%10;
	    	  reverse=reverse*10+remainder;
	    	  temp=temp/10;
	      
	      }
          System.out.println("the reverse no is="+reverse);
		
		 }
		
	}



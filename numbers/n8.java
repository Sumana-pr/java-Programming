package number;
/* 
 * wap to find the sum of all the digits in a no
 * 4+2+3=9
 */
import java.util.Scanner;                                  //int num =432
public class n8 {                                           // int sum=0;
                                                             // while(num>0)
	public static void main(String[] args) {                // sum+=sum%10; // sum=sum+num%10;
		Scanner sc=new Scanner(System.in);                   // num=num/10;
         System.out.println("enter the number");
            int num=sc.nextInt();
	        int sum=0;
		    while(num>0) {
		    	  sum+=num%10;
		    	  num =num/10;
		      }
	          System.out.println("sum="+sum);

	}
	}



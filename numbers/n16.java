package number;
/*
 * wap to calculate the factorial of a number
 * enter the number
   7
   5040
 
 */
import java.util.Scanner;
public class n16 {
	
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int factorial=1;
		
		for(int i=1;i<=num;i++)
		{
			 factorial=factorial*i;
		}
		System.out.println(factorial);
         

	}

}

package number;
/*
 * wap to calculate the factorial of a number by using method recurssion(imp)
 * enter the number
   5
  120

 */
import java.util.Scanner;
public class n17 {
	
	public static int factorial(int num)
	{
		if(num==0)
			return 1;
		else
			return num*factorial(num-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println(factorial(num));
	
	}
	
	

}

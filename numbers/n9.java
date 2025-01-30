package number;
/*
 * wap to find the product of all the digits in a no
 * 4*3*2=24
 */
import java.util.Scanner;
public class n9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int product=1;
		while(num>0)
		{
			product*=num%10;
			num=num/10;
		}
		System.out.println("product="+product);
		
	}

}

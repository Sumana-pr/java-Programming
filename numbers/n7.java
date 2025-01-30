package number;
/*
 * wap to check whether the number is positive or negtive
 *  enter the number
 *  432 
 *  positive number
 */
import java.util.Scanner;
public class n7 {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Sc.nextInt();
		/*int num = -6;*/
		if(num>0)
		{
		   System.out.println(num+" is a positive number");
		}
		else
		{
			System.out.println(num+" is a negative no");
		}

	}

}

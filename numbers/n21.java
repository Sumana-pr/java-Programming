package number;
/*
 * wap to chcek whether a number is armstrong number 
 * 1=1^1
 * 2=2^1
 * 3=3^1
 * 153-3=153^3=153
 * 1634-3=1634^3=1634
 * 0/p   1634
        armstrong number 
        
    o/p   154
         not a armstrong number

 */
import java.util.Scanner;
public class n21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		// counting the digits
		int temp=num;
		int digit=0;
		while(temp>0)
		{
			digit++;
			temp=temp/10;
		}
		// sum of digits raise to the power
		temp=num;
		int sum=0;
		int remainder;
		while(temp>0)
		{
			int power=1;
			remainder=temp%10;
			for(int i=0;i<digit;i++)
			{
				power=power*remainder;
			}
			temp=temp/10;
			sum=sum+power;
		}
		if(num==sum)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println(" not a armstrong number");
		}


	}

}

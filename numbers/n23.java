package number;

/*
 * wap to check whether peterson number
 * 145 - 1!+4!+5! = 1+24+120 =145
 * o/p  145
      peterson number
   o/p  123
     not a peterson number
 */
import java.util.Scanner;

public class n23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
	    int temp=num;
		int sum=0;
		int remainder;
		while(temp>0)
		{
			remainder=temp%10;
			int factorial=1;
			for(int i=remainder;i>=1;i--)
			{
				 factorial=factorial*i;
			}
			sum+=factorial;
			temp=temp/10;
		}
	  if(num==sum)
	  {
		  System.out.println("peterson number");
	  }
	  else
	  {
		  System.out.println(" not a peterson number");
	  }


	}

}

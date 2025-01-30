package number;
/*wap to check whether a no is sunny no
 * eg: 8,24,80
 * 8+1=9(if the no is perfect square)
 * 45is not a sunny no

 */
import java.util.Scanner;
public class n29 {
	
	public static double sqrtroot(int num)
	{
		double sqrt=num/2;
		double temp=0;
		while(sqrt-temp!=0)
		{
			temp=sqrt;
			sqrt=(temp+num/temp)/2;
		}
		return sqrt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   
		System.out.println("enter the number");
		int num=sc.nextInt();
		double sqrt=sqrtroot(num+1);
		if(sqrt%1==0)
		{
			System.out.println(num+"is asunny no");
		}
		else
		{
			System.out.println(num+"is not a sunny no");
		}
		
	}
			
		

}

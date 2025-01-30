package number;
/*
 * wap to print even and odd sumber
 * 2550
  2500

 */
import java.util.Scanner;
public class n34 {

	public static void main(String[] args) {
		
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				evensum+=i;
			}
			else
			{
				oddsum+=i;
			}
			
		}
		System.out.println(evensum);
		System.out.println(oddsum);
	}

}

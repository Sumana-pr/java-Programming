package number;
/*
 * wap to check whether a year is leap year(imp)
 * leap year/4  
 * century year/400    400,800,1200,1600,2000
 * o/p
 * 200
   leap year  
   1990
1990is not a leap year
   
 */
import java.util.Scanner;
public class n32 {
	
	public static boolean isleapyear(int year)
	{
		boolean flag=true;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
			}
	     }
		else
		{
			flag=false;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                  
        System.out.println("enter the number");
           int num=sc.nextInt();
           int year=num;
		if(isleapyear(year)) {
        	  System.out.println(year+"is a leap year");
          }
           else
           {
        	   System.out.println(year+"is not a leap year");
           }
           
	}

}


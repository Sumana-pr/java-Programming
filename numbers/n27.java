package number;
/*
 * wap to check whether a no is tech no
 * 2025 check even or not
 * 20+25=45
 * 45^2
 * 2025
 * 3035 - 30+35 =55 ,55^2 = 3025
 * o/p  enter the number
           2025is  a tech
 */
import java.util.Scanner;
public class n27{
	 
	public static int noOfdigits(int num)
	{
		int digits=0;
		while(num>0)
		{
			digits++;
			num/=10;
		}
		return digits;
	}

public static boolean istechno(int num,int digits)
{
	int x=1;
	for(int i=0;i<digits/2;i++)
	{
		x=x*10;
	}
	int n1=num/x;
	int n2=num%x;
	int sqr=(n1+n2)*(n1+n2);
	if(num==sqr)
		return true;
	else
		return false;
}

public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);                  
     System.out.println("enter the number");
     int num=sc.nextInt();
     int digits=noOfdigits(num);
    	 if(digits%2==0)
    		 if(istechno(num,digits))
    		 {
    			 System.out.println(num+"is a tech no");
    		 }
    		 else
    		 {
    			 System.out.println(num+"is not a tech no");
    		 }
     }
    	 
     }



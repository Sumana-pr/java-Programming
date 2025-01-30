package number;
/*
 * wap to find natural number 1 to 100
 * 200
   20100
 */
import java.util.Scanner;

public class n33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                  
        System.out.println("enter the number");
           int num=sc.nextInt();
           int sum=0;
           for(int i=1;i<=num;i++)
           {
        	 sum+=i;   
           }
           System.out.println(sum);
	}

}

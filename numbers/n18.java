package number;
/*
 * wap to print fibonocci series(imp)
 * 0,1,1,2,3,5,8,13,21,34
 */

/*public class n18 {

	public static void main(String[] args) {
         int count=5;
         int n1=0;
         int n2=1;
         int n3;
         System.out.print(n1+","+n2);
         
         for(int i=0;i<count-2;i++)
         {
        	 n3=n1+n2;
        	 System.out.print(","+n3);
        	 n1=n2;
        	 n2=n3;
         }

			

}
}*/

/*0,1,1,2,3,5,8,13,21,34*/
import java.util.Scanner;

public class n18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in fibonacci series: ");
		int num = sc.nextInt();
		int num1 =0;
		int num2 =1;
		int num3;
		System.out.print(num1+","+num2);
		for(int i=0; i<num-2;i++) {
			num3 = num1 + num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;
		}
	}
}

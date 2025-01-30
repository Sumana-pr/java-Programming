package number;
/*
 * wap to print fibonocci series using method recussion(imp)
 * 0,1,1,2,3,5,8,13,21,34
 */
import java.util.Scanner;
public class n19 {
	
		static int n1=0,n2=1,n3;
        
		public static  void printFibonocci(int count )
		{
			if(count>0)
			{
				n3=n1+n2;
				System.out.print(","+n3);
				n1=n2;
				n2=n3;
				printFibonocci(count-1);
			}
			
				
		}

		public static void main(String[] args) {
			int count=10;
	         System.out.print(n1+","+n2);
	         printFibonocci(count-2);
	         
	        
			
			
		}

}

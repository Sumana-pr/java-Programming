package number;

import java.util.Scanner;

/*
 * wap to check whether the number is spy number(sum of all the digits is equal to product of digits)
 * 2+2=4,2*2=4
 * 132=1+3+2=6,1*3*2=6
 * enter the number
    132
   spy number
   enter the number
   134
   not a spy number
 */
public class n25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                  
        System.out.println("enter the number");
           int num=sc.nextInt();
           int temp=num;
	        int sum=0;
	        int product=1;
	        int remainder;
		      while(temp>0) {
		      remainder=temp%10;
		      sum+=remainder;
		      product*=remainder;
		      temp=temp/10;
	          
		      }
		      if(sum==product)
		      {
	          System.out.println("spy number");
		      }
		      else {
		    	  System.out.println(" not a spy number");
		      }
		    	  
	          
	        	  
	}
	}



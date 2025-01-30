package number;
//wap to find the no is stong no
	// 40585
	// 5!=120
	// 8!=40320
	// 5!=120
	// 0!=1
	// 4!=24
	// -----
	// 40585

	

	// 145=
	// 5!=120
	// 4!=24
	// 1!=1
	// -----
	// 145

import java.util.Scanner;
public class n31 {

	  public static int strongno(int num){
	    int temp=num;
	    int remainder;
	    int sum=0;
	    while(temp>0){
	        int fact=1;
	        remainder=temp%10;
	        for(int i=remainder; i>=1; i--){
	            fact=fact*i;
	    }
	    sum+=fact;
	    temp=temp/10;
	}
	return sum;
	  }
	        public static void main(String[] args){
	          Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number");
	        int num = sc.nextInt();
	        if(num==strongno(num)){
	            System.out.println(num+"The given no is strong no");
	        }
	        else
	        {
	        	System.out.println(num+"The given no is  not strong no");   
	        }
	        }
}



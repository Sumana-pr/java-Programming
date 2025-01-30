package number;
/*
 * wap to find a square root of a number
 * X(k+1)=1/2(Xk+num/Xk)   -  Xk=num/2=4  = Xk=1/2(4+9/4)(4+2.25/2)=6.25
 * o/p  enter the number
           5
        2.23606797749979

 */
import java.util.Scanner;
public class n28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                  
	     System.out.println("enter the number");
	     int num=sc.nextInt();
	     double temp=0;
	     double  sqr=num/2;
	     
	    while(sqr-temp!=0)
	     {
	    	temp=sqr;
	    	sqr=(temp+num/temp)/2;
	    	 
	     }
	    System.out.println(sqr);



	}

}

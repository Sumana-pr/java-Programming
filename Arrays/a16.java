package array;
/*
 * wap for left rotation
 * o/p rotate=2
 * [10, 30, 45, 80, 100]
   [45, 80, 100, 10, 30]
   
   o/p rotate=3;
   [10, 30, 45, 80, 100]
    [80, 100, 10, 30, 45]
   
 */
import java.util.Arrays;

public class a16 {

	public static void main(String[] args) {
		 int[] a = {10,30,45,80,100};

	        System.out.println( Arrays.toString(a));
	         int rotate=3;
	       for(int i=0;i<rotate;i++)
	       {
	    	   int first=a[0];
	    	   for(int j=0; j<a.length-1;j++) {
	    		   a[j]=a[j+1];
	    	   }
	    	   a[a.length-1]=first;
	    }
	       System.out.println(Arrays.toString(a));
	    }

	}



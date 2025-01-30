package array;
/*
 * wap for right rotate
 * o/p rotate=2
 * [20, 10, 40, 30, 50]
   [30, 50, 20, 10, 40]
   
   rotate=4
   [20, 10, 40, 30, 50]  
   [10, 40, 30, 50, 20]
 * 
 */

import java.util.Arrays;

public class a15 {

    public static void main(String[] args) {
        int[] a = {20, 10, 40, 30, 50};

        System.out.println( Arrays.toString(a));
         int rotate=4;
       for(int i=0;i<rotate;i++)
       {
    	   int last=a[a.length-1];
    	   for(int j=a.length-1;j>0;j--) {
    		   a[j]=a[j-1];
    	   }
    	   a[0]=last;
    }
       System.out.println(Arrays.toString(a));
    }
}



		

	

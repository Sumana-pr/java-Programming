package array;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*
 * wap to find the duplicate elements
 * o/p
 * 30
10
45
10

 */
public class a21 {

		public static void main(String[] args) {
			int[] a= {10,30,45,80,100,30,10,45,10,10};
			LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
			for(int i=0;i<a.length-1;i++)
			{
				if(!h.add(a[i])) {
					System.out.println(a[i]);
				}
				
				
				
			}


	}

}

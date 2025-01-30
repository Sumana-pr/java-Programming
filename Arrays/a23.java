package array;
/*
 * wap to remove duplicate elements from the array using collections
 * o/p
 * [10, 30, 45, 80, 100]
 * 
 */


import java.util.LinkedHashSet;

public class a23 {

	public static void main(String[] args) {
		int[] a= {10,30,45,80,100,30,10,45,10,10};
		
		LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
				
		}
		System.out.println(h);
	}
}
			
		



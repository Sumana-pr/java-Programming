package array;

import java.util.Arrays;

/*
 * wap to print duplicate elements (vvimp)
 * o/p
 * the duplicate elements is10
  the duplicate elements is10
  the duplicate elements is10
  the duplicate elements is30
  the duplicate elements is45
 * 
 */
public class a20 {

	public static void main(String[] args) {
		int[] a= {10,30,45,80,100,30,10,45,10,10};
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println("the duplicate elements is" +a[i+1]);
			}
		}

	}

}

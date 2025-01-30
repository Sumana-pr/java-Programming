package array;

import java.util.Arrays;

/*wap to find the largest and the least element in an array or maximum and minimum
 * o/p
 * 
 * [10, 20, 30, 40, 50]
   Largest=50
    Least=10
 * 
 */
public class a11 {

	public static void main(String[] args) {
		int[] a= {20,10,30,50,40};
		Arrays.sort(a); // bubblesort[i]
		System.out.println(Arrays.toString(a));
		System.out.println("Largest="+a[a.length-1]);
		System.out.println("Least="+a[0]);
	}

}

package array;
/*
 * *wap to find the 2nd largest and the 3rd largest element in an array or maximum and minimum
 * 
 * o/p
 * 
 * [10, 20, 30, 40, 50]
   2nd Largest=40
   3rd Least=30
 */
import java.util.Arrays;

public class a12 {

	public static void main(String[] args) {
		int[] a= {20,10,30,50,40};
		Arrays.sort(a); // bubblesort[i]
		System.out.println(Arrays.toString(a));
		System.out.println("2nd Largest="+a[a.length-2]);
		System.out.println(" 3rd Least="+a[a.length-3]);

	}

}

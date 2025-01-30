package array;
/*
 * wap to copy the elements of one array into another array
 * [10, 30, 45, 80, 100]
   [10, 30, 45, 80, 100]
 */
import java.util.Arrays;

public class a17 {

	public static void main(String[] args) {
		int[] a= {10,30,45,80,100};
		int[] b=new int[a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));


	}

}

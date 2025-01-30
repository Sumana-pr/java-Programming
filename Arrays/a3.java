package array;

import java.util.Arrays;

/*
 * wap to revesre on array
 * o/p  [10, 20, 30, 40, 50]
        [50, 40, 30, 20, 10]

 */
public class a3 {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length/2;i++)
		{
		   a[i]=a[i]+a[a.length-i-1];
		   a[a.length-i-1]=a[i]-a[a.length-i-1];
		   a[i]=a[i]-a[a.length-i-1];
		}
		System.out.println(Arrays.toString(a));
	}

}

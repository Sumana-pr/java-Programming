package array;

import java.util.Arrays;


/*  wap to remove duplicate elements from the array  */
/*o/p
 * [10, 10, 10, 10, 30, 30, 45, 45, 80, 100]
   [10, 30, 45, 80, 100]
 * 
 */
public class a22 {

	private static int i;

	public static void main(String[] args) {
		int[] a= {10,30,45,80,100,30,10,45,10,10};
		Arrays.sort(a); 
		System.out.println(Arrays.toString(a));
		int [] temp=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
			
		}
		temp[j]=a[a.length-1];
		a=new int[j+1];
		for(int i=0;i<a.length;i++)
		{
		   a[i]=temp[i];	
		   
		}
		System.out.println(Arrays.toString(a));
		
	}
	
}
	


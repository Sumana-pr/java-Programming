package array;

import java.util.Arrays;

/*
 * wap for selection sort in descending order 
 * o/p   [50, 20, 10, 40, 30]
         [50, 40, 30, 20, 10] 
 */
public class a7 {
	
	public static void  selectionsort(int [] x)
	{
		for(int i=0;i<x.length;i++)
		{
			int maxindex=i;
			for(int j=i+1;j<x.length;j++)
			{
				if(x[j]>x[maxindex])
				{
					maxindex=j;
				}
			}
			if(maxindex!=i)
			{
				int temp=x[i];
				x[i]=x[maxindex];
				x[maxindex]=temp;
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		int[] a= {50,20,10,40,30};
		System.out.println(Arrays.toString(a));
		selectionsort(a);
		System.out.println(Arrays.toString(a));
		
		
	}

	}






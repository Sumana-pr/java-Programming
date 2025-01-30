package array;

import java.util.Arrays;

/*
 * wap for selection sort in ascending order
 * (find the list elements with  1,2,3, 4, 5 positions)
 * o/p  [50, 20, 10, 40, 30]
        [10, 20, 30, 40, 50]
 */
public class a6 {
	
	public static void  selectionsort(int [] x)
	{
		for(int i=0;i<x.length;i++)
		{
			int minindex=i;
			for(int j=i+1;j<x.length;j++)
			{
				if(x[j]<x[minindex])
				{
					minindex=j;
				}
			}
			if(minindex!=i)
			{
				int temp=x[i];
				x[i]=x[minindex];
				x[minindex]=temp;
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



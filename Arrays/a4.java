package array;
/*
 * wap for bubble sort in ascending order(imp)
 * o/p  [30, 20, 10, 50, 40]
        [10, 20, 30, 40, 50]

 */
import java.util.Arrays;

public class a4 {
	
	public static void  bubblesort(int [] x)
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=1;j<x.length-i;j++)
			{
				if(x[j-1]>x[j])
				{
					int temp=x[j-1];
					x[j-1]=x[j];
					x[j]=temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int[] a= {30,20,10,50,40};
		System.out.println(Arrays.toString(a));
		bubblesort(a);
		System.out.println(Arrays.toString(a));
		
		
	}

	}


package array;
/*
 * wap to find the product of all the elements in the array
 * o/p  12000000
 * sum=sum*a[0]=0*10=0
 * sum=sum*a[1]=10*20=2000
 * sum=sum*a[2]=30*30=90000
 * sum=sum*a[3]=60*40=100000
 * sum=sum*a[4]=100*50=12000000
 */
public class a2 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			product=product*a[i];
		}
		System.out.println(product);
	}
	}



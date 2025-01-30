package array;
/*
 * wap to find the sum of all the elements in the array
 * sum=sum+a[0]=0+10=10
 * sum=sum+a[1]=10+20=30
 * sum=sum+a[2]=30+30=60
 * sum=sum+a[3]=60+40=100
 * sum=sum+a[4]=100+50=150
 * o/p 150    
 * 
 */
public class a1 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}

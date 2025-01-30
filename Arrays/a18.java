package array;
/*
 * wap check frequancy of an array
 * o/p
 * 10=4
 * 
 */
import java.util.Arrays;

public class a18 {
	
	
	

	public static void main(String[] args) {
		int[] a= {10,30,45,80,100,30,10,30,80,10,10};
		
		int [] frequancy = new int[a.length];
		int visited=-1;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
			    if(a[i]==a[j])
			    {
			    	count++;
			    	frequancy[j]=visited;
			    }
			}
			if(frequancy[i]!=visited)
			{
				frequancy[i]=count;
			}
		}
		for(int i=0;i<frequancy.length;i++)
		if(frequancy[i]!=visited);
		{	
			
			int i = 0;
			System.out.println(a[i]+"="+frequancy[i]);	
		}

	}
	

}

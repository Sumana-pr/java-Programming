package array;
/*
 * wap to find the duplicate elements in an array(imp)
 * o/p
 * the duplicate elements is10
   the duplicate elements is30
   
   o/p
the duplicate elements is10
the duplicate elements is10
the duplicate elements is10
the duplicate elements is30
the duplicate elements is30
the duplicate elements is30
the duplicate elements is10
the duplicate elements is10
the duplicate elements is10

 * 
 */

public class a19 {

	public static void main(String[] args) {
		
		int[] a= {10,30,45,80,100,30,10,10,10,30};
		 
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			    if(a[i]==a[j])
			    {
			    	System.out.println("the duplicate elements is"+a[i]);
			    }
			}
		}
	}
}
			



package array;
/*
 * 
 * wap for linear search search the array in forward or one direction
 * 
 * o/p
 * 50is not a presnt in index=-1
 */
public class a13 {
	
	
	public static void LinearSearch(int[]x,int key)
	{
		int index=-1;
		
		for(int i=0;i<x.length;i++) //insert the array in forward direction
			if(x[i]==key)
			{
				index=i;
				break;
			}
		if(index!=-1)
		{
			System.out.println(key+"is a presnt in index="+index);
			
		}
		else
		{
			System.out.println(key+"is not a presnt in index="+index);
		}
	}

	public static void main(String[] args) {
		int[]a= {10,30,80,45,100};
		LinearSearch(a,50);

	}

}

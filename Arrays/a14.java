package array;

import java.util.Arrays;

/*
 * wap for binary search
 * 1. sorted
 * 2.key=20
 * o/p
 * 30is a presnt in index=1
 * 200is not a presnt in index=-1
 * 
 * 
 */
public class a14 {

	
		public static void BinarySearch(int[]x,int key)
		{
			int fstindex=0;
			int lastindex=x.length-1;
			int keyindex=-1;
			
			while(fstindex<=lastindex)
			{
				 int midindex=(fstindex+lastindex)/2;
				if(key==x[midindex])
				{
					keyindex=midindex;
					break;
			    }
				else if(key<x[midindex])
				{
					lastindex=midindex-1;
				}
				else if(key>x[midindex])
				{
					fstindex=midindex+1;
				}
			
			
			
			if(keyindex!=-1)
			{
				System.out.println(key+"is a presnt in index="+keyindex);
				
			}
			else
			{
				System.out.println(key+"is a  not presnt in index="+keyindex);
				
			}
			
			}
		}
		

		public static void main(String[] args) {
			int[]a= {120,100,45,30,80,10,145};
			Arrays.sort(a);			
			BinarySearch(a,200);

		}

	}



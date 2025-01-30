package Stringprg;

import java.util.Arrays;

/*
 * wap to sort the characters in string
 * string to char array
 * by using one constractor to convert char array to string
 * o/p
 * pkieeda
 * 
 */
public class s4 {

	
		public static void  bubblesort(char [] x)
		{
			for(int i=0;i<x.length;i++)
			{
				for(int j=1;j<x.length-i;j++)
				{
					if(x[j-1]<x[j])
					{
						char temp=x[j-1];
						x[j-1]=x[j];
						x[j]=temp;
					}
				}
			}
		}
		

		public static void main(String[] args) {
			String s= "deepika";
			char[] ch=s.toCharArray();
			bubblesort(ch);
			String s1=new String(ch);
			System.out.println(s1);
			
	}

}

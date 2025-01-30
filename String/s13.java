package Stringprg;

import java.util.Arrays;

/*
 * wap to find the non repated characters in a string
 * o/p
the  non repeated elements is a
the  non repeated elements is d
the  non repeated elements is h
the  non repeated elements is k
the  non repeated elements is o
the  non repeated elements is p
the  non repeated elements is r
the  non repeated elements is s



 */
public class s13 {

	public static void main(String[] args) {
		String s="shradha kapoor";
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]!=ch[i+1])
			{
				System.out.println("the  non repeated elements is " +ch[i+1]);
			}
	}
	}
}



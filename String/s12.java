package Stringprg;

import java.util.Arrays;

/*
 * wap to find the repeated characters or duplicate characters in a string (vimp)
 * to canvert string to char
 * sort the array
 * repeated chars comes to next to each other
 * duplicate valeues comes next to each other
 * o/p
the duplicate elements is a
the duplicate elements is a
the duplicate elements is h
the duplicate elements is o
the duplicate elements is r

 */
public class s12 {

	public static void main(String[] args) {
		String s="shradha kapoor";
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				System.out.println("the duplicate elements is " +ch[i+1]);
			}
		}

	}

}

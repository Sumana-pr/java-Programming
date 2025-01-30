package Stringprg;
/*
 * wap to check whether a string is polindrome
 * relational operator is comparess the reference of the object
 * so we want to compare vale so we use s.equals or s.content
 * o/p
 * java  is not a polindrome
 * 
 */
public class s3 {

	public static void main(String[] args) {
		String s="abcba ";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		if(s.contentEquals(reverse))//f(s.equals(reverse)) // 
		{
			System.out.println(s+"is a polindrome");
		}
		else
		{
			System.out.println(s+" is not a polindrome");
		}

	}

}



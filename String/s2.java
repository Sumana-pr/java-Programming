package Stringprg;
/*
 * wap to print reverse of string
 * o/p
 * avaj
   --------
    avaj
 * 
 */
public class s2 {

	public static void main(String[] args) {
		String s="java";
		
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		System.out.println("--------");
		
		
		String reverse1="";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse1=reverse1+ch[i];
		}
		System.out.println(reverse1);

	}
}


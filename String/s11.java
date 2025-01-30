package Stringprg;
/*
 * wap to reverse the string using recussion(imp)
 * o/p
 * avaj
 */
public class s11 {
	
	
	
	public static String reverseString(String s)
	{
		if(s.length()==1)
			return s;
		else
			return s.charAt(s.length()-1)+reverseString(s.substring(0,s.length()-1));
			
	}


	public static void main(String[] args) {
       
		System.out.println(reverseString("java"));
}
}
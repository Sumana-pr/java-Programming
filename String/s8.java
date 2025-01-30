package Stringprg;
/*
 * wap to swap string data without using temp variable
 * o/p
 * deepika
   padukone
   -------
   padukone
   deepika
 * 
 */
public class s8 {

	public static void main(String[] args) {
		String s1="deepika";
		String s2="padukone";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-------");
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);


	}

}

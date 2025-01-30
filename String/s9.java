package Stringprg;
/*
 * wap to find the length of the string without using inbuilt method(vvimp)
 * o/p
 * 7
 */
public class s9 {

	public static void main(String[] args) {
		String s="deepika";
		char[] ch=s.toCharArray();
		int length=0;
		for(int i=0;i<ch.length;i++) // using foreach loop for(char lv:ch)
		{
			length++;
		}
		System.out.println(length);
	}

}

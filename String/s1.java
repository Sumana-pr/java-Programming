package Stringprg;

/*
 * wap to count the number of character in a string
 * char charAt(int index) 
 * char[] tocharArray(); //it converts string to char
 * int length() is method in array length is variable
 * o/p
 * the number of character=10
    -------------
   the number of character=10
 */
public class s1 {

	public static void main(String[] args)
	{
		String s = "java Is Easy";
		int countChar = 0;
		for (int i = 0; i < s.length(); i++) // int length()
		{
			if (s.charAt(i) != ' ')  // char charAt(int index)
			{
				countChar++;
			}
		}
			System.out.println("the number of character=" + countChar);
			System.out.println("-------------");

			int countCharNew = 0;
			char[] ch = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != ' ') {
					countCharNew++;
				}
			}
			System.out.println("the number of character=" + countCharNew);
		}

	}


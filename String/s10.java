package Stringprg;
/*
 * wap to count the number of vowels cansonents and digits
 * foreach loop is used to itterate the array and collections
 * lv=loop variable
 * o/p
 * ramya is short and 45
 * 5
 * 10
 * 2
    
 */
public class s10 {

	public static void main(String[] args) {
		String s = "ramya is short and 45";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		int vowelcount=0;
		int consonantcount=0;
		int digitcount=0;
		for(char lv:ch)
		{
			if(lv=='a'||lv=='e'||lv=='i'||lv=='o'||lv=='u')
			{
				vowelcount++;
			}
			else if(lv>='a'&&lv<='z')
			{
				consonantcount++;
			}
			else if(lv>='1'&&lv<='9')
			{
				digitcount++;
			}
		}
		System.out.println(s);
		System.out.println(vowelcount);
		System.out.println(consonantcount);
		System.out.println(digitcount);
	}
}

	



package Stringprg;
/*
 * wap to reverse a sentence
 * fst split the string then concate the array and reverse the string
 * split is used to split the string
 * o/p
 * abhi is handsome
    handsome is abhi 
 */
public class s5 {

	public static void main(String[] args) {
		String s="abhi is handsome";
		String[] x=s.split(" ");
		
		String reverse="";
		for(int i=x.length-1;i>=0;i--)
		{
			reverse=reverse+x[i]+" ";
		}
		System.out.println(s);
		System.out.println(reverse);
	}

}

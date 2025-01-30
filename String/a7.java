package Stringprg;
/*
 * wap to find langest word in a sentence
 * o/p
 * bobybuilder
 */
public class a7 {

	public static void main(String[] args) {
		String s="arnold is the best bobybuilder";
		String[] x=s.split(" ");
		String longest="";
		for(int i=0;i<x.length;i++)
		{
			if(x[i].length()>longest.length())
			{
				longest=x[i];
			}
		}
		System.out.println(longest);
		
	}
}

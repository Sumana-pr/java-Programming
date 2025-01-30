package number;
/*
write a prg to swap two numbers without using temp
1000
2000
-------
2000
1000
   
 
 */
public class n2 {

	public static void main(String[] args) {
		int a=1000;
		int b=2000;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-------");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

	}

}

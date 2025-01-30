package number;
/*
  write a prg to print odd numbers form 1 to 100
  1 3 5 7 .......99
 */
public class n4 {

	public static void main(String[] args) {
		int num=100;
		for(int i=0;i<=num;i++)
		{
			if(i%2 == 1)
				System.out.println(i);
		}
		

	}

}

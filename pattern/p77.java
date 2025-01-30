/*
 ABCBA
 ABA
  A
 ABA
ABCBA
 * 
 */
package patterns;

public class p77 {

	public static void main(String[] args) {
		int row=5;
		int space=0;
         int noch=row;
		for (int i = 0; i < row; i++) {
			char c='A';

      for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < noch; j++) {
				if(j<noch/2) {
					System.out.print(c++);
					
			}
				else {
					System.out.print(c--);
			}

			}
			System.out.println();
			if(i<row/2) {
			space++;
			noch-=2;
			}
			else {
				space--;
				noch+=2;

	}


	}

	}
}

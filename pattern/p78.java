/*
12321
 121
  1
 121
12321
 * 
 */
package numbers;

public class p78 {

	public static void main(String[] args) {
		int row=5;
	int space=0;
         int noch=row;
		for (int i = 0; i < row; i++) {
			int num=1;
      for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < noch; j++) {
				if(j<noch/2) {
					System.out.print(num++);
					
				}
				else {
					System.out.print(num--);
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


/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
package stars;

public class p60 {

	public static void main(String[] args) {
		int row=9;
		int space=row/2;
		int star=1;
		for (int i = 0; i < row; i++) {
				for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
				for (int k = 0; k < star; k++) {
				System.out.print('*');
				}
				System.out.println();
				if(i<row/2) {
			space--;
				star+=2;
				}
				else {
					space++;
					star-=2;
			}

	}

}
}

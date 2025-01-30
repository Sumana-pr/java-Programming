/*
  *
 **
***
 **
  *
 */
package stars;

public class p74 {

	public static void main(String[] args) {
		int row=5;
		int space=2;
		int star=1;
		for (int i = 0; i < row; i++) {
		
		for (int j = 0; j < space; j++) {
			System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<row/2) {
		space--;
			star++;
			}
			else {
				space++;
				star--;

	}

}
	}
}

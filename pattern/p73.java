/*
*****
 ***
  *
 ***
*****
 */
package stars;

public class p73 {

	public static void main(String[] args) {
		int row=5;
	int space=0;
	int star=row;
	for (int i = 0; i < row; i++) {
	
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
		}
		for (int j = 0; j < star; j++) {
				System.out.print("*");
		}
		System.out.println();
		if(i<row/2) {
		space++;
		star-=2;
		}
		else {
				space--;
				star+=2;



	}
	}
	}
}



/*
  1
 000
11111
 000
  1

 */
package numbers;

public class p82 {

	public static void main(String[] args) {
		int row=5;
		int space=row/2;
	int star=1;
	for (int i = 0; i < row; i++) {
		
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {
			System.out.print((i+1)%2);
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

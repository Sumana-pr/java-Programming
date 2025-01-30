/*
  1
 010
10101
 010
  1
 */
 
package numbers;

public class p81 {

	public static void main(String[] args) {
		int row=5;
		int space=row/2;
		int star=1;
		for (int i = 0; i < row; i++) {
	
		for (int j = 0; j < space; j++) {
			System.out.print(' ');
			}
		for (int j = 0; j < star; j++) {
			System.out.print((i+j+1)%2);
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

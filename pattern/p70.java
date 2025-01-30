/*
*        *
**      **
***    ***
****  ****
**********
 */
package stars;

public class p70 {

	public static void main(String[] args) {
		int row=5;
		int noch=1;
		int space=2*row-2;
		for(int i=0;i<row;i++) {
			for(int j=0;j<noch;j++) {
				System.out.print('*');
			}
			for(int k=0;k<space;k++) {
				System.out.print(' ');
			}	
			for(int j=0;j<noch;j++) {
				System.out.print('*');
			}
				
	  System.out.println();
	  space-=2;
	  noch++;

	}

}
}

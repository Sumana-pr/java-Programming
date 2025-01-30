/*
*    *****
**   ****
***  ***
**** **
******
 */
package stars;

public class p72 {

	public static void main(String[] args) {
		int row=5;
		int space=row-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row-space;j++) {
				System.out.print('*');
			}
			for(int k=0;k<space;k++) {
				System.out.print(' ');
			}	
			for(int j=0;j<space+1;j++) {
				System.out.print('*');
			}
				
	  System.out.println();
	  space--;
	}

}
}

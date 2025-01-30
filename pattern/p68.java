/*
 *  *  *
 * * * 
  ***  
*******
  ***  
 * * * 
*  *  *

 */
package stars;

public class p68 {

	public static void main(String[] args) {
		int row=7;
		int col=7;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==row/2||j==col/2||i==j||i+j==row-1) {
					System.out.print('*');
				}
				else
				{
					System.out.print(' ');
				}
	
			}
			System.out.println();

	}

}
}

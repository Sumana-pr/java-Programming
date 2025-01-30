/*
*****
 ****
   **
    *
   **
 ****
*****
 */
package stars;

public class p69 {

	public static void main(String[] args) {
		int row=7;
		int noch=0;
		int space=2*row-2;
		for(int i=0;i<row;i++) {
				for(int j=0;j<space;j++) {
					System.out.print(' ');
					for(int k=0;k<noch;k++) {
						System.out.print('*');
					}
					System.out.println();	 
					if(i<row/2)
					{
						space++;
						noch--;
					}
					else
					{
						space--;
						noch++;
					}
				}
				
			}	   
				
	}
}

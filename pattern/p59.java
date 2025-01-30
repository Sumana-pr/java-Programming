/*
*********
 *     *
  *   *
   * *
    *
 */
package stars;

public class p59 {

	public static void main(String[] args) {
		int row=5;
		int noch=2*row-1;
		int space=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k=0;k<noch;k++) {
				if(k==0 || k==noch-1|| i==0)
				{
				System.out.print('*');
				}
				else
				{
					System.out.print(' ');
				}
		}	   
				
	  System.out.println();
	    noch-=2;
	    space++;
	  
	   

	}

}
}

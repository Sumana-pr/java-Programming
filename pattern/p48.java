/*
*******
 *****
  ***
   *
 */
   
package stars;

public class p48 {

	public static void main(String[] args) {
		int row=4;
		int noch=(row*2)-1;
		int space=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k=0;k<noch;k++) {
				System.out.print('*');
			      			
		}	   
				
	  System.out.println();
	    noch-=2;
	    space--;
	   
	    
	    
	}
	}

}


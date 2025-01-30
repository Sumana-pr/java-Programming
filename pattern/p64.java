/*
 ***
 **
 *
 **
 ***
 */
package stars;

public class p64 {

	public static void main(String[] args) {
		int row=5;
		int noch=row/2+1;
		for(int i=0;i<row;i++) {
			for(int k=0;k<noch;k++) {
				System.out.print('*');
			}	   
				
	  System.out.println();
	  if(i<row/2)
	  {
		  noch--;
	  }
	  else
	  {
		  noch++;
	  }
	}
	}
}





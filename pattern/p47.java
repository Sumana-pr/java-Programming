/*
    1
   010
  10101
 0101010
101010101

 */
package numbers;

public class p47 {

	public static void main(String[] args) {
		int row=5;
		int noch=1;
		int space=row-1;
		for(int i=0;i<row;i++) {
			int num=1;
			for(int j=0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k=0;k<noch;k++) {
				System.out.print((i+k+1)%2);
			      			
		}	   
				
	  System.out.println();
	    noch+=2;
	    space--;
	    
	}
	}
}

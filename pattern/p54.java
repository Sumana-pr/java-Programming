/*
   101010101
    1010101
     10101
      101
       1

 */
package numbers;

public class p54 {

	public static void main(String[] args) {
		int row=5;
		int noch=(row*2)-1;
		int space=0;
		int num=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k=0;k<noch;k++) {
				System.out.print((k+1)%2);
	
			      			
		}	   
				
	  System.out.println();
	    noch-=2;
	    space--;
	    num--;

	}

}
}

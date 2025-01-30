/*
33333
222
1

 */
package numbers;

public class p50 {

	public static void main(String[] args) {
		int row=3;
		int noch=(row*2)-1;
		int space=0;
		int num=3;
		for(int i=0;i<row;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k=0;k<noch;k++) {
				System.out.print(num);
			      			
		}	   
				
	  System.out.println();
	    noch-=2;
	    space--;
	    num--;
	    

	}

}
}

/*
555555555
 4444444
  33333
   222
    1

 */
package numbers;

public class p51 {

	public static void main(String[] args) {
		int row=5;
		int noch=(row*2)-1;
		int space=0;
		int num=5;
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

/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

 */
package patterns;

public class p42 {

	public static void main(String[] args) {
		int row=5;
		int noch=1;
		int space=row-1;
		for(int i=0;i<row;i++) {
			char ch = 'A';
			for(int j=0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k=0;k<noch;k++) {
				System.out.print(ch);
				if(k<(noch/2)) 
				{
					ch++;
				}
				else
				{
				 ch--;  
				}					
		}	   
				
	  System.out.println();
	    noch+=2;
	    space--;
	    
	}

}
}

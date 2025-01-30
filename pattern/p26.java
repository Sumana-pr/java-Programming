/*
 * 1    
   00   
   111  
   0000 
   11111
 */
package numbers;

public class p26 {

	public static void main(String[] args) {
		int row = 5;
		int col=5;
		int num=1;
		for(int i=0;i< row;i++) {
			for(int j=0;j< col;j++) {
				if(i>=j)
				{
					System.out.print((i+1)%2);
				}
				else
				{
					System.out.print(' ');
				}
				if(num==9)
					num=0;
			}
			System.out.println();

	}

}
}

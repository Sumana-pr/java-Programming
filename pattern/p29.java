/*
 *  1
   22
  333
 4444
55555
 */
package numbers;

public class p29 {

	public static void main(String[] args) {
		int row = 5;
		int col=5;
		 int num=1;
		for(int i=0;i< row;i++) {
			for(int j=0;j< col;j++) {
				if(i+j>=row-1)
				{
					System.out.print((i+1));
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();

	}

}
}

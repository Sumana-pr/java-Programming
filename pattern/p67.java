/*
*****
* * *
*****
* * *
*****

 */
package stars;

public class p67 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==row/2||i==0||i==row-1||j==0||j==col-1||j==col/2) {
					System.out.print('*');
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

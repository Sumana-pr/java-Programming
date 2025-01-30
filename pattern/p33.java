/*
 * 1 2 3 4 5
 * 2 3 4 5
 * 3 4 5
 * 4 5
 * 5
 */
package numbers;

public class p33 {

	public static void main(String[] args) {
		int row = 5;
		int col=5;
		for(int i=0;i< row;i++) {
			int num=1+i;
			for(int j=0;j< col;j++) {
				if((i+j)<row)
				{
					System.out.print(num++);
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

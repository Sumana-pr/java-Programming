// 1 0 1 0 1
// 0 1 0 1
// 1 0 1 
// 0 1
// 1
package numbers;

public class p18 {

	public static void main(String[] args) {
		int row = 5;
		int col=5;
		for(int i=0;i< row;i++) {
			for(int j=0;j< col;j++) {
				if(i+j<=row-1)
				{
					System.out.print((i+j+1)%2);
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

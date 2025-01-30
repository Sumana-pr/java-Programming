//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
package numbers;

public class p13 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col;j++) {
				if(j%2==0) {
				System.out.print(1);
			}
				else {
					System.out.print(0);
				}
				}
			System.out.println();
	}

}
}

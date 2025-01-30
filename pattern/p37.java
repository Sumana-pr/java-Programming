/*
  1
 123
12345

 */
package numbers;

public class p37 {

	public static void main(String[] args) {
		int row=3;
		int noch=1;
		int space=row-1;
		for(int i=0;i<row;i++) {
			int num=1;
			for(int j=0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k=0;k<noch;k++) {
				System.out.print(num++);
		}
	    System.out.println();
	    noch+=2;
	    space--;
	    num++;
	}

}
}

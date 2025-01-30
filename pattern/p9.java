//5
//5 4
//5 4 3
//5 4 3 2
//5 4 3 2 1
package numbers;

public class p9 {

	public static void main(String[] args) {
		int  row=5;
		 int col=5;
		 for(int i=0;i<row;i++) {
			 int num=5;
		for(int j=0;j<col;j++) {
			if(i>=j)
			{
				System.out.print(num--);
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

















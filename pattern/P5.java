//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

package numbers;

public class P5 {

	public static void main(String[] args) {
		int  row=5;
		 int col=5;
		 for(int i=0;i<row;i++) {
			 int num=1;
		for(int j=0;j<col;j++) {
			if(i>=j)
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

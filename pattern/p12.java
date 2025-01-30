//5
//4 4
//3 3 3
//2 2 2 2
//1 1 1 1 1
package numbers;

public class p12 {

	public static void main(String[] args) {
		 int  row=5;
		 int col=5;
		int num=5;
		 for(int i=0;i<row;i++) {
			
		for(int j=0;j<col;j++) {
			if(i>=j)
			{
				System.out.print(num);
			}
			else
			{
				System.out.print(' ');
			}
		}
		 System.out.println();
		 num--;
	}

}
}

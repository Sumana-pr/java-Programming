//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
package numbers;
                                               
public class p6 {

	public static void main(String[] args) {
		int  row=5;
		 int col=5;
		 int num=1;
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
		 num++;
	}
}
}
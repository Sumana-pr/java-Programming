//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
package numbers;

public class P8 {

	public static void main(String[] args) {
		int  row=5;
		 int col=5;
		 int num=1;
		 for(int i=0;i<row;i++) {
			
		for(int j=0;j<col;j++) {
			if(i>=j)
			{
				System.out.print( num++);
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

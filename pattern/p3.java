//A
//A B
//A B C
//A B C D
//A B C D E

package patterns;

public class p3 {

	public static void main(String[] args) {
		 int  row=5;
		 int col=5;
		 for(int i=0;i<row;i++) {
			 char ch='A';
		for(int j=0;j<col;j++) {
			if(i>=j)
			{
				System.out.print(ch++);
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

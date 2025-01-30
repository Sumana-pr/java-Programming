// A
// B C
// D E F
// G H I J
// K L M N O

package patterns;

public class p7 {

	public static void main(String[] args) {
		 int  row=5;
		 int col=5;
		 char ch='A';
		 for(int i=0;i<row;i++) {
			
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

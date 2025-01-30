/*
 * 1    
   23   
   456  
   7890 
   12345
 */
package numbers;

public class p27 {

	public static void main(String[] args) {
		int row = 5;
		int col=5;
		int num=1;
		for(int i=0;i< row;i++) {
			for(int j=0;j< col;j++) {
				if(i>=j)
				{
					System.out.print(num++);
				}
				else
				{
					System.out.print(' ');
				}
				if(num==10)
					num=0;
			}
			System.out.println();

	}

}
}

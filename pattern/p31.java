/*
 * A    
   BA   
   CBA  
   DCBA 
   EDCBA
 */
package patterns;

public class p31 {

	public static void main(String[] args) {
		int row = 5;
		int col=5;
		for(int i=0;i< row;i++) {
			char ch =(char)('A'+i);
			for(int j=0;j< col;j++) {
				if(i>=j)
				{
					System.out.print(ch--);
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

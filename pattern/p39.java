package numbers;

/*
    1
   121
  12321
 1234321
123454321

 */
public class p39 {

	public static void main(String[] args) {
		int row=5;
		int noch=1;
		int space=row-1;
		for(int i=0;i<row;i++) {
			int num=1;
			for(int j=0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k=0;k<noch;k++) {
				System.out.print(num);
				if(k<(noch/2)) 
				{
					num++;
				}
				else
				{
				 num--;  
				}					
		}	   
				
	  System.out.println();
	    noch+=2;
	    space--;
	    
	}

}
}

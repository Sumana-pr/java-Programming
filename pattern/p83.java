package numbers;
/*
11111
 2222
  333
   44
    5
 */

public class p83 {

		public static void main(String[] args) {
			int row = 5;
			int col=5;
			 int num=1;
			for(int i=0;i< row;i++) {
				for(int j=0;j< col;j++) {
					if((i<=j))
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

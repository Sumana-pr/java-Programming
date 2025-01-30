package number;
/*
 * wap to check whether number is fascinating no
 * ex: 192=num*2=384
 *        =num*3=576
 *        =total:192384576 all the no should be present and it is not repeated and also the no should be more than >=3
 *        
 *   o/p
 *   1245
    124524903735
     1245is a not a fascinating no
     o/p
     
     192384576
   192is a fascinating no

 */
import java.util.Scanner;
public class n30 {
	
	public static int noOfdigits(int num) 
	{
		int digits=0;
		while(num>0)
		{
			digits++;
			num/=10;
		}
		return digits;
	}
	public static boolean isFascinatingNo(int num)
	{
		boolean flag=true;
		String s=""+num+num*2+num*3;
		System.out.println(s);
		
		for(char ch='1';ch<=0;ch++) {
			int count=0;
		for(int i=0;i<s.length();i++ ){
			
		
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		
		if(count!=1)
		{
			flag=false;
				
		}
	
}
		return flag;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);                  
	     System.out.println("enter the number");
          int num=sc.nextInt();
	        if(noOfdigits(num)>=3)
	         {
	    	 if(isFascinatingNo(num))
	    	 {
	    		 System.out.println(num+"is a fascinating no");
	    	 }
	    	 else
	    	 {
	    		 System.out.println(num+"is a not a fascinating no");
	    	 }
     	}
	     else
    	 {
    		 System.out.println(num+"is a not a fascinating no");
    	 }
	}
	     

}

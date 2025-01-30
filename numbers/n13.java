package number;

/*
 * wap to check to print prime number directly in main 
 * enter the number
   12
   12is  not a prime

 */
import java.util.Scanner;

public class n13 {

	public static void isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i < num / 2; i++)
			if (num % i == 0) {
				flag = false;
				break;

			}
		if (flag) {
			System.out.println(num + "is a prime");
		} else {
			System.out.println(num + "is  not a prime");

		}
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int num = sc.nextInt();
			isPrime(num);
		
	}
}


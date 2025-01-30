package number;
/*
 * wap to check whether a number is prime no ( its divisiable by 1 and itself called prime)imp
 * enter the number
    17
   17is a prime
 */
import java.util.Scanner;

public class n12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
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

}

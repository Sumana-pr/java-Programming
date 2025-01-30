package number;
/*
 * wap to check whether polindrome
 * enter the number
      365
    num is not a palindrome
 */
import java.util.Scanner;

public class n11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int temp = num;
		int remainder = 0;
		int reverse = 0;
		while(temp>0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp / 10;
		}

		if (num == reverse) {
			System.out.println(num + " is a palindrome");
		}

		else {
			System.out.println(num + " is not a palindrome");
		}

	}

}

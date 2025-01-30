package number;
/*
 * wap to print prime numbers from 1 to 1000
 * 1 2 3 5 7 11 13 .......997
 */

import java.util.Scanner;

public class n14 {
	
	public static void printPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <=num / 2; i++)
			if (num % i == 0) {
				flag = false;
				break;

			}
		if (flag) {
			System.out.println(num);
		} 
	}
		public static void main(String[] args) {
			

            for(int i=1;i<=100;i++)
			printPrime(i);
			
			
		}
}












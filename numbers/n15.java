package number;
/*
 * method recurssion print prime numbers 1 to 1000
 2 3 5 7.......997
 */
import java.util.Scanner;

public class n15 {
	
	public static boolean isPrime(int a, int b) {
        if (a <= 1) return false; 
        if (b * b > a) return true; 
        if (a % b == 0) return false; 
        return isPrime(a, b + 1); 
    }

    
    public static void printPrimes(int x, int y) {
        if (x >y) return; 
        if (isPrime(x, 2)) {
            System.out.print(x + " "); 
        }
        printPrimes(x + 1, y); 
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 1000:");
        printPrimes(1, 1000); 
    }

}








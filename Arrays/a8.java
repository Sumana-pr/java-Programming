package array;

/* 
 * wap for insertion sort in ascending order consider the 0th position with the first position element if 1st position element is lesser than the 0th element then the 1st element position is shifted to its
 */
//Before sorting: [20, 10, 40, 30, 50]
//After sorting: [10, 20, 30, 40, 50]
import java.util.Arrays;
public class a8 {

	    public static void insertionSort(int[] x) {
	        for (int i = 1; i < x.length; i++) {
	            int temp = x[i];
	            int j = i - 1; // Assume the first element is already sorted

	            while (j >= 0 && temp < x[j]) { // Iterate sorted portion in backward direction
	                x[j + 1] = x[j]; // Shift the numbers to the right side
	                j--;
	            }
	            x[j + 1] = temp; // Place the current element in its correct position
	        }
	    }

	    public static void main(String[] args) {
	        int[] a = {20, 10, 40, 30, 50};

	        System.out.println("Before sorting: " + Arrays.toString(a));
	        insertionSort(a);
	        System.out.println("After sorting: " + Arrays.toString(a));
	    }
	

	}



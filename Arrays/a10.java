package array;
/*
 * wap for insertion sort in ascending order
 *consider the 0th position with the first position element if 1st position element is lesser than the 0th element position is
 *shifted to the left of the 0th position element and continues 
 * o/p
 * Before sorting: [20, 10, 40, 30, 50, 8]
  After sorting: [8, 10, 20, 30, 40, 50]
 */

import java.util.Arrays;
public class a10 {


	    public static void insertionSort(int[] x) {
	        for (int i = 1; i < x.length; i++) {
	            int temp = x[i];
	            int j = i - 1; /* We imagine the first element is already sorted */

	            while (j >= 0 && temp < x[j]) { /* To iterate the sorted portion in backward direction, we use this while loop */
	                x[j + 1] = x[j]; /* To shift the no to the right side */
	                j--;
	            }
	            x[j + 1] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int[] a = {20, 10, 40, 30, 50, 8};

	        System.out.println("Before sorting: " + Arrays.toString(a));
	        insertionSort(a);
	        System.out.println("After sorting: " + Arrays.toString(a));
	    }
	}


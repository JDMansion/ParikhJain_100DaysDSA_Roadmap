import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		
		if(n < 2) {
			return arr[0];
		}

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		//find the largerst
		for(int i=0; i<n; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}

		//find second largest
		for(int i=0; i<n; i++) {
			if(arr[i] != largest) {
				second = Math.max(arr[i], second);
			}
		}

		if(second == Integer.MIN_VALUE) {
			return -1;
		}
		else {
			return second;
		}
		
	}
}

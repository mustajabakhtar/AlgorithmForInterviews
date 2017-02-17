/**
 * 
 */
package com.mustajab.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class DistinctElementKthWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 4, 2, 3 };
		printDistinctElementInKthWindow(a, 4);

	}

	private static void printDistinctElementInKthWindow(int[] a, int k) {

		// Map declared to store the respective count
		Map<Integer, Integer> storeCount = new HashMap<Integer, Integer>();
		Integer distinctCount = 0;

		for (int i = 0; i < k; i++) {
			if (storeCount.get(a[i]) == null) {
				storeCount.put(a[i], 1);
				distinctCount++;
			} else {
				int count = storeCount.get(a[i]);
				storeCount.put(a[i], count + 1);
			}
		}

		System.out.println(distinctCount);

		for (int i = k; i < a.length; i++) {
			if (storeCount.get(a[i-k]) == 1)
            {
				storeCount.remove(a[i-k]);
				distinctCount--;
            }
            else // reduce count of the removed element
            {
               int count = storeCount.get(a[i-k]);
               storeCount.put(a[i-k], count-1);
            }
 
            // Add new element of current window
            // If this element appears first time,
            // increment distinct element count
            if (storeCount.get(a[i]) == null)
            {
            	storeCount.put(a[i], 1);
            	distinctCount++;
            }
            else // Increment distinct element count
            {
               int count = storeCount.get(a[i]);
               storeCount.put(a[i], count+1);
            }
 
           // Print count of current window
            System.out.println(distinctCount);
		}

	}

}

/**
 * 
 */
package com.interview.bits;

/**
 * @author Mustajab
 *
 */
public class OppSignNumbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 100, y = 100;

		int flag = getPositiveOrNagative(x, y);
		if (flag == -1) {
			System.out.println("Opposite sign" + flag);
		} else {
			System.out.println("Same sign" + flag);
		}

	}

	private static int getPositiveOrNagative(int x, int y) {
		return ((x ^ y) >> 31);
	}

}

package org.james.day04.control.loop.excercise;

public class Excercise_ForDouble1 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		int i = 0;
		int j = 0;
		for (i = 1; i <= 6; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

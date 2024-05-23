package org.james.day05.dimarray.excercise;

public class Excercise_DimArray4_1 {

	public static void main(String[] args) {
		int l = 5;
		int[][] arr = new int[l][l];
		int sum = 1;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				arr[i][(i + 1) % 2 != 0 ? j : l - 1 - j] = sum++;
			}
		}
		
		for (int[] r : arr) System.out.printf("%d\t%d\t%d\t%d\t%d\t\n", r[0], r[1], r[2], r[3], r[4]);
	}
}
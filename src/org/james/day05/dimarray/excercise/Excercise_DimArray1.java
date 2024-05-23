package org.james.day05.dimarray.excercise;

public class Excercise_DimArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arrs = new int [5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >=0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int [] arr: arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
//		int k = 5;
//		for(int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				arrs[i][j] = k;
//				k--;
//			}
//			k += 10;
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arrs[i][j] + "\t");
//			}
//			System.out.println();
//		}

	}

}

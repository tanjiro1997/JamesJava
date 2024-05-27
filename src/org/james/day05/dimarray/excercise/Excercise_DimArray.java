package org.james.day05.dimarray.excercise;

public class Excercise_DimArray {
	
	public void practice1() {

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

	public void practice2() {
		int [][] arrs = new int [5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		for(int [] arr: arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				arrs [i][j] = k;
//				k++;
//			}
//		}
//		for (int i = 4; i >= 0; i--) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(arrs[j][i] + "\t");				
//			}
//			System.out.println();
//		}
	}

	public void practice3() {
		int [][] arrs = new int [5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arrs [j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arrs [i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void practice4() {
		int [][] arrs = new int [5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					arrs[i][j] = k++;
				}
			}else {
				for(int j =4; j >= 0; j--) {
					arrs[i][j] = k++;
				}
			}
		}
		for(int [] arr : arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				arrs [i][j] = k;
//				k++;
//			}
//		}
//		for(int i = 0; i < 5; i++) { 
//			for(int j = 0; j < 5; j++)
//			if(i%2 != 0) {
//					System.out.print(arrs [i][4-j] + "\t");
//			}else System.out.print(arrs [i][j] + "\t");
//			System.out.println();
//		}
	}

}

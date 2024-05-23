package org.james.day05.dimarray.excercise;

public class Excercise_DimArray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arrs = new int [5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arrs [i][j] = k;
				k++;
			}
		}
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++)
			if(i%2 != 0) {
					System.out.print(arrs [i][4-j] + "\t");
			}else System.out.print(arrs [i][j] + "\t");
			System.out.println();
		}

	}

}

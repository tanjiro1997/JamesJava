package org.james.day05.dimarray.excercise;

import java.util.Scanner;

public class Excercise_DimArray8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각행렬의 사이즈를 입력하시오 : ");
		int size = sc.nextInt();
		int k = 1;
		int [][] arrs = new int [size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j< size; j++) {
				arrs[i][j]=k;
				k++;
			}
		}
//		for(int i = 0; i < size; i++) {
//			for(int j = 0; j< size; j++) {
//				System.out.print(arrs[i][j] + "\t");
//			}
//			System.out.println();
//		}
		System.out.print(arrs[0][2] + "\t");System.out.print(arrs[0][1] + "\t");System.out.print(arrs[0][0] + "\t");
		System.out.println();
		System.out.print(arrs[1][0] + "\t");System.out.print(arrs[2][2] + "\t");System.out.print(arrs[2][1] + "\t");
		System.out.println();
		System.out.print(arrs[1][1] + "\t");System.out.print(arrs[1][2] + "\t");System.out.print(arrs[2][0] + "\t");
	}

}

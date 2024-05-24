package org.james.day06.array.sort.excercise;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// 5개의 정수를 입력한 후 입력한 값들이 오름차순 정렬로 표현 되도록 구현
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			int nums = sc.nextInt();
			arrs[i] = nums;
		}
		// {7, 4, 8, 5, 1}
		// {1, 4, 5, 7, 8}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4-i; j++) {
				if(arrs[j]>arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		System.out.printf("정렬된 결과 : %d %d %d %d %d\n", arrs[0], arrs[1], arrs[2], arrs[3], arrs[4]);
		System.out.println("정렬 후 첫번째 수와 마지막 수의 합 : " + (arrs[0]+arrs[4]));
		

	}

}

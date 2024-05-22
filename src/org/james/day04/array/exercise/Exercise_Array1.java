package org.james.day04.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String [] args) {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		// 입력받고 평균을 구하는 프로그램을 작성하라.
		// 단, 배열의 크기는 5이다.
		int [] nums = new int [5];;
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		// 정수 입력 5번 하는데 배열에 저장
		for (int i = 0; i < nums.length; i++) {
			System.out.print("정수 하나 입력 : ");
			nums[i] = scanner.nextInt();
			sum+=nums[i];
		}
		// 배열에 있는 값을 더한 후 평균 구해서 출력
//		for (int i=0; i<nums.length;i++) {
//			sum+=nums[i];
//		}
		System.out.println("입력받은 값의 평균 : " + (double)sum/nums.length);// 둘 중 하나만 해도 됨
																		// 자동 형변환되기 때문임.
	}

}

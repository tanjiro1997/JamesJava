package org.james.day04.array.practice;

import java.util.Scanner;

public class Practice_Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 7
		// 배열의 길이를 직접 입력받아 그 값만큼 정수형 배열을 선언 및 할당
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		// 배열 전체 값 나열 각 인덱스에 저장된 값들의 합 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum = 0;
		int [] arrs = new int [num];
		for (int i = 0; i < arrs.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int input = sc.nextInt();
			arrs [i] = input;
		}
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
			sum += arrs[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}

}

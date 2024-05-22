package org.james.day04.array.practice;

public class Practice_Array1 {

	public static void main(String[] args) {
		// 문제 1
		// 길이 10, 1부터 10까지 반복문 이용
		// 배열에 넣은 후 값 출력
		int [] arrs = new int [10];
		for (int i = 0; i < 10; i++) {
			arrs[i] = i+1;
			System.out.print(arrs[i] + " ");
		}

	}

}

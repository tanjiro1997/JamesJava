package org.james.day03.control.loop.exercise;

import java.util.Scanner;

public class Excercise_Loop1_2 {
	public static void main(String[] args) {
		// 반복문_실습문제_01

		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}

	}
}

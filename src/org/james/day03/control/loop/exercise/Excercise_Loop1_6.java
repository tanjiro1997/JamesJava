package org.james.day03.control.loop.exercise;

import java.util.Scanner;

public class Excercise_Loop1_6 {
	public static void main(String[] args) {
		// 반복문_실습문제_01

		// 6번
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
		int num = scanner.nextInt();
		int i = 0;
		int j = 0;
		if (num <= 9) {
			for (j = num; j < 10; j++) {
				for (i = 1; i < 10; i++) {

					System.out.println(j + "*" + i + "=" + j * i);
				}
			}

		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}

}

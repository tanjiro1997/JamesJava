package org.james.day03.control.loop.exercise;

import java.util.Scanner;

public class Excercise_Loop1_5 {
	public static void main(String[] args) {
		// 반복문_실습문제_01

		//5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int num = scanner.nextInt();
		int i = 1;
		do {
			System.out.println(num + "*" + i + " = " + num * i); i++;
		} while(i <= 9);

	}
}

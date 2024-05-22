package org.james.day03.control.loop.exercise;

import java.util.Scanner;

public class Excercise_Loop2_1 {

	public static void main(String[] args) {
		// 반복문_실습문제_02

		// 1번
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
		int num = scanner.nextInt();
		int i2 = 0;
		int i3 = 0;
		for (i2 = 1; i2 <= num; i2++) {
			if (i2%2 == 0)
			System.out.println("2의 배수 : " + i2);
		}
		for (i3 = 1; i3 <= num; i3++) {
			if (i3%3 == 0)
				System.out.println("3의 배수 : " + i3);
		}
		System.out.println("2와 3의 공배수의 개수 : " + num/6 + "개");
	}

}

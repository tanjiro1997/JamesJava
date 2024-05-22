package org.james.day03.control.loop.exercise;

import java.util.Scanner;

public class Excercise_Loop2_2 {

	public static void main(String[] args) {
		// 반복문_실습문제_02

		// 2번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 3
		 *
		 **
		 ***
		 **
		 *
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		int i = 0;
		int j = 0;
		for (i = 1; i <= num; i++) {
			for (j = 0; j < i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
		for (i=num-1; i > 0; i--) {
			for (j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		System.out.println("*");
//		System.out.print("*");System.out.println("*");
//		System.out.print("*");System.out.print("*");System.out.println("*");
//		System.out.print("*");System.out.println("*");
//		System.out.println("*");
//		

		
	}

}

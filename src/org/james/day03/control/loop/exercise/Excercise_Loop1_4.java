package org.james.day03.control.loop.exercise;

import java.util.Scanner;

public class Excercise_Loop1_4 {
	public static void main(String[] args) {
		// 반복문_실습문제_01

		//4번  
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 입력 : ");
		int num2 = scanner.nextInt();
		int i = 0;
		if ((num1 < 1) || (num2 <2)) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}else if(num1 < num2) {
		for (i = num1; i <= num2; i++) {
			System.out.print(i + " ");
			}
		}else {
			for (i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
			
		}
	}
}

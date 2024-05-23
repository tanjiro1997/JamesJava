package org.james.day05.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excercise_Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 2
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는
		// InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		// 정수 3개를 입력하세요.
		// 11 2 3
		// 합은 16
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			try {
				sum += sc.nextInt();
			} catch (InputMismatchException e) {
				//e.printStactTrace();
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next();
				i--;  //중요**
			}
		}
		System.out.printf("합은 %d\n", sum);
//		int num1 = 0, num2 = 0, num3 = 0;
//		while(true) {
//			
//		try {
//			System.out.print("3개의 정수를 입력하세요 : ");
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//			num3 = sc.nextInt();
//		}catch(InputMismatchException e) {
//			System.out.println("문자를 입력하셨습니다.");
//			sc.next();
//			continue;
//		}
//		System.out.println(num1+num2+num3);
//		}

	}

}

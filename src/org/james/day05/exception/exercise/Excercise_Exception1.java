package org.james.day05.exception.exercise;

import java.util.Scanner;

public class Excercise_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력 받는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		int result = 0;
		while(true) {			
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			int	num2 = sc.nextInt();
			try {
				result = num1 / num2;				
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
				continue;
			}
			System.out.printf("%d을 %d로 나눈 몫은 %d입니다.\n", num1, num2, result );
		}
		

	}

}

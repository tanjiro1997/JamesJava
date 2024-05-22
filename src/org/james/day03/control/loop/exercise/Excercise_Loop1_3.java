package org.james.day03.control.loop.exercise;

import java.util.Scanner;

public class Excercise_Loop1_3 {
	public static void main(String[] args) {
		// 반복문_실습문제_01

		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
		Scanner scanner = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {	// 1부터 입력한 값까지 증가하며 반복을 해야되기 때문에
											// int = 1; 이고 조건식의 최대값은 입력받은 값이어야 함. i는 증가 (++)
			sum += i;						// 1부터 입력한 값까지 더해주는 식
			if(i != num) System.out.print(i + "+"); // +로 연결
			else System.out.print(i+"=");			// 마지막은 =으로 연결
		}
		System.out.println(sum);
		System.out.println("총 합 : " + sum);
	}
}

package org.james.day04.array.practice;

import java.util.Scanner;

public class Practice_Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 6
		// 요일 문자배열을 만들어서
		// 0을 입력하면 월요일, 4를 입력하면 금요일이 출력되도록하고
		// 0~6 이외에 숫자를 입력하면 잘못입력하셨습니다를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		String day [] = {"월", "화", "수", "목", "금", "토", "일"};
		if(num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.print(day[num] + "요일");
		}

	}

}

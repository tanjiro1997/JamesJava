package org.james.day02.operator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String [] args) {
		// 산술연산
		// +, -, *, /, %
		// % : 나머지를 구해주는 연산자
		// 문제1
		// 초 단위의 정수를 입력받고, 몇시간, 몇분, 몇초인지 출력하는 프로그램을 작성하여라
		System.out.print("초 단위의 정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		// 3000 -> ?시간, ?분, ?초
		int hour = time / 60 / 60;
		int minute = (time / 60) % 60;
		int second = time % 60;
		
		System.out.println(time +"초는 " + hour + "시간, " + minute + "분, " + second + "초 입니다." );
		
		/*
		 * ex) 5000/60
		 * 83/60 = 1h
		 * 83%60 = 23m
		 * 5000%60 = 20s
		 */
		
	}

}

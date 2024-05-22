package org.james.day02.operator.exercise;

import java.util.Scanner;

public class Excercise_Logical2 {
	public static void main(String [] args) {
		// 문제 1
//		System.out.println("입력한 정수가 1~100 사이의 숫자인지 확인하세요!");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		boolean result = (1 <= num) && (num <= 100);
//		System.out.println("1부터 100사이의 숫자인가? : " + result);
		
		// 문제 2
//		char a = 'A'+1;
//		//String str = "";
//		//a = 'a'+1;
//		System.out.println("문자 : " + a);
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		char word = sc.next().charAt(0);
		boolean result = (65 <= word) && (word <= 90);
		System.out.println("영어 대문자 확인 : " + result);
	}

}

package org.james.day04.array.practice;

import java.util.Scanner;

public class Practice_Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 8
		// 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가
		// 중간 이후부터 끝까지는 1씩 감소하여 출력
		// 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요"를 출력
		// 다시 정수를 받도록
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num<3 || num%2 == 0) {
			 
				System.out.println("다시 입력하세요.");
			
			
		}
		int [] arrs = new int [num]; 
		

	}

}

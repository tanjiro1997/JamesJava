package org.james.day04.array.practice;

import java.util.Scanner;

public class Practice_Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 3
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수 하나 입력 : ");
		int input = scanner.nextInt();
		if(input>0 ) {			
			int [] arrs = new int [input];
			for (int i = 0; i < input; i++) {
				arrs[i] = i+1;
				System.out.print(arrs[i] + " ");
			}
		}else System.out.println("0보다 큰 수를 입력하세요.");

	}

}

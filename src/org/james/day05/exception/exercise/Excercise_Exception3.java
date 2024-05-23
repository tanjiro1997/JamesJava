package org.james.day05.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excercise_Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 3
		// 배열의 인덱스가 범위를 벗어날 때
		// 발생하는 ArrayIndexOutOfBoundsException을
		// 처리하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("0~4 사이의 숫자 하나 입력 : ");
		int i = 0;
		int [] arrs = {1,2,3,4,5};
		
		i = sc.nextInt();
		try {
			System.out.println(arrs[i]);	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("범위를 벗어났습니다! 다시 입력하세요");
		}

	}

}

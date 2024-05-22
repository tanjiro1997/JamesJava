package org.james.day03.control.loop.exercise;

import java.util.Scanner;

public class Excercise_While2 {

	public static void main(String[] args) {
		// While문을 이용하여 -1이 입력될때까지
		// 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		while (i != -1) {
			System.out.print("정수 하나 입력 : ");
			i = sc.nextInt();
			if( i== -1) break;
			sum += i;
		}
		System.out.println("총합 : " + sum);
		
		int num = 0;
		int sum2 = 0;
		System.out.print("정수 하나 입력 : ");
		while((num = sc.nextInt()) != -1) {
			sum2 += num;
		}
		System.out.println("총합 : " + sum2);
	}

}

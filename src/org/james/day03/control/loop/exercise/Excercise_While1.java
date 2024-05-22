package org.james.day03.control.loop.exercise;

public class Excercise_While1 {

	public static void main(String[] args) {
		// While문을 이용하여 1 ~ 100사이의 홀수의 합을 출력하시오.
		// 1 ~ 100 사이의 홀수의 합 : ?
		int i = 0;
		int sum = 0;
		while (i < 50) {
			sum += (2 * i) + 1;
			i++;
		}
		System.out.println(sum);

		/*
		 * int i = 1; int sum = 0; while(i < 100) { if (i % 2 != 0) { sum += 1; } i++;
		 * System.out.println("1 ~ 100 사이의 홀수의 합 :" + sum)
		 */
	}

}

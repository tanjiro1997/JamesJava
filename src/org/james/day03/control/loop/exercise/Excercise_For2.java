package org.james.day03.control.loop.exercise;

public class Excercise_For2 {

	public static void main(String[] args) {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		int i;
		for (i = 1; i <= 10; i++) {
			//sum = sum+i;
			sum += i;
			if(i <= 9) System.out.print(i + "+");
			else System.out.print(i + "=");
		}
		System.out.print(sum);
	}

}

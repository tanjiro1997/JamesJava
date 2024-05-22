package org.james.day04.control.loop.excercise;

public class Excercise_ForDouble3 {

	public static void main(String[] args) {
		// 2단을 세로로 출력, 그 옆에 3단 세로로 출력,
		// 그 옆에 4단 세로로 출력
		int i = 0;
		int j = 0;
		for (j = 1; j <10; j++) {
			for (i = 2; i < 10; i++) {
				System.out.print(i + " * " + j + " = " + i*j);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}

package org.james.day04.control.loop.excercise;

public class Excercise_ForDouble2 {

	public static void main(String[] args) {
		// 0시 0분부터 23시 59분까지 출력하기
		int time = 0;
		int minute = 0;
		for (time = 0; time < 24; time++) {
			for (minute = 0; minute < 60; minute++) {
				System.out.println(time + "시" + minute + "분");
			}
		}

	}

}

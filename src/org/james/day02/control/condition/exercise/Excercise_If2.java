package org.james.day02.control.condition.exercise;

import java.util.Scanner;

public class Excercise_If2 {
	public static void main(String [] args) {
		// 문제 2
		// 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		// 주문하시겠어요? 가격을 알려드립니다.
		// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		// 메뉴를 입력해주세요 : 에스프레소
		// 2500원입니다.
		// 메뉴를 입력해주세요 : 자바칩프라프치노
		// 없는 메뉴입니다.
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.print("메뉴를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.next();
		if(menu.equals("에스프레소")) { // 문자열 비교는 ==이 안됨, 문자열 비교는 equals
			System.out.println("2500원입니다.");
		}else if(menu.equals("카푸치노")) {
			System.out.println("4000원입니다.");
		}else if(menu.equals("카페라떼")) {
		System.out.println("4000원입니다.");
		}else if(menu.equals("아메리카노")) {
			System.out.println("2500원입니다.");
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		 

//		switch (menu) {
//			case "에스프레소":
//				System.out.println("에스프레소 가격은 2000원입니다.");
//				break;
//			case "카푸치노":
//				System.out.println("카푸치노 가격은 4000원입니다.");
//				break;
//			case "카페라떼":
//				System.out.println("카페라떼 가격은 4500원입니다.");
//				break;
//			case "아메리카노":
//				System.out.println("아메리카노 가격은 2500원입니다.");
//				break;
//			default:
//				System.out.println("없는 메뉴입니다.");
//		}
	}

}

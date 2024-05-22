package org.james.day02.operator.exercise;

public class Excercise_Logical1 {
	public static void main(String[] args) {
		// 문제 1
		boolean result1, result2, result3, result4;
		int a = 50;
		int b = 30;
		result1 = (a!=b) && (a<b);
		result2 = (a<b) || (a==b);
		result3 = (a>b) && (a!=b);
		result4 = (a>b) || (a==b);
		System.out.println("결과값 1 : " + result1);
		System.out.println("결과값 2 : " + result2);
		System.out.println("결과값 3 : " + result3);
		System.out.println("결과값 4 : " + result4);
		
		// 문제 2
		boolean result5, result6, result7, result8;
		int c = 70;
		int d = 55;
		result5 = (c==d) || (c++<100);
		// c : 71, d : 55, result1 : true
		result6 = (c < d) && (--d<55); // and의 경우 앞의 결과가 false면 뒤는 연산X
		// c : 71, d : 55, result2 : false
		result7 = (c != d) && (d--<c++);
		// c : 72, d : 54, result3 : true
		result8 = (c++ != d) || (d++ >=85); // or의 경우 앞의 결과 true면 뒤는 연산X
		// c : 73, d : 54, result4 : true
		System.out.println("결과값 5 : " + result5 + ", 결과값 6 : " + result6 + ", 결과값 7 : " + result7 + ", 결과값 8 : " + result8);
		System.out.println("c : " + c + ", d : " + d);

		
	}
}

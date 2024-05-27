package org.james.day04.array.practice;

import java.util.Scanner;

public class Practice_Array {
	
	public void practice1() {
		// 문제 1
		// 길이 10, 1부터 10까지 반복문 이용
		// 배열에 넣은 후 값 출력
		int [] arrs = new int [10];
		for (int i = 0; i < 10; i++) {
			arrs[i] = i+1;
			System.out.print(arrs[i] + " ");
		}
	}

	public void practice2() {
		// 문제 2
		// 길이 10, 1부터 10까지 반복문 이용
		// 역순으로 배열에 넣은 후 값 출력
		int [] arrs = new int [10];
		for (int i = 0; i  < 10; i++) {
			arrs [i] = 10 - i;
			System.out.print(arrs [i] + " ");
		}

	}

	public void practice3() {
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
		}else System.out.println("0보다 큰 수를 입력하세요.");}

	public void practice4() {
		// 문제 4
		// 길이가 5인 String배열 선언
		// "사과", "귤", "포도", "복숭아", "참외",로 초기화
		// 배열 인덱스를 활용해서 귤을 출력
//		String [] arrs = new String [5];
		String arrs[] = {"사과", "귤", "포도", "복숭아", "참외"};
//		System.out.println(arrs[1]);
		for(int i = 0; i < arrs.length; i++) {
			if(arrs[i].equals("귤")) {
				System.out.println(arrs[i]);
				break;
			}
		}
	}

	public void practice5() {
		// 문제 5
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고
		// 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 : ");
		String object = scanner.next();
		// 입력받은 문자열을 어떻게 문자 하나하나 배열에 넣을 것인가?
		// 그럼 그 배열은 무슨 배열이어야 하는가?
		int count = 0;
		int size = object.length();
		char [] words = new char[size]; // 만들어지는 문자배열은 입력한 문자열의 길이만큼 크기를 가져야 함.
		for(int i = 0; i < size; i++) {
			words[i] = object.charAt(i); // "문자열".charAt(0) 하면 ""안에 문자열 중 0번째에 해당하는 문자를 가져옴. 이 경우 '문'이 구해짐
		}
		System.out.print("검색할 문자 : ");
		char search = scanner.next().charAt(0);
		System.out.print(object + "에 " + search + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < words.length; i++) { // 배열.length 하면 배열의 크기가 구해짐. 배열이면 다 가능
			if(words[i] == search) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(search + "개수 : " + count);
		
		
		
//		words[0] = object.charAt(0);
//		words[1] = object.charAt(1);
//		words[2] = object.charAt(2);	// 이러한 작업을 문자열의 길이만큼 반복해야함.
		// 그 배열에 어떻게 검색한 문자가 있는지 처리할 것인가?
		
	}

	public void practice6() {
		// 문제 6
		// 요일 문자배열을 만들어서
		// 0을 입력하면 월요일, 4를 입력하면 금요일이 출력되도록하고
		// 0~6 이외에 숫자를 입력하면 잘못입력하셨습니다를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		String day [] = {"월", "화", "수", "목", "금", "토", "일"};
		if(num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.print(day[num] + "요일");
		}

	}

	public void practice7() {
		// 문제 7
		// 배열의 길이를 직접 입력받아 그 값만큼 정수형 배열을 선언 및 할당
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		// 배열 전체 값 나열 각 인덱스에 저장된 값들의 합 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum = 0;
		int [] arrs = new int [num];
		for (int i = 0; i < arrs.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int input = sc.nextInt();
			arrs [i] = input;
		}
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
			sum += arrs[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {}
	
	public void practice9() {}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		char [] idNums = new char[idNum.length()];
		for (int i = 0;i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);
		}
		char [] copy = new char[idNums.length];
		for (int i = 0; i < idNums.length; i++) {
			//copy[i] = idNums[i];
			if(i < 8) {
				copy[i] = idNums[i];
			}else {
				copy[i] = '*';
			}
		}
		for(char num : copy) {
			System.out.print(num);
		}
	}
	
	public void practice11() {}
	
	public void practice12() {}

}


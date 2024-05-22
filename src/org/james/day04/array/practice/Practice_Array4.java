package org.james.day04.array.practice;

public class Practice_Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}

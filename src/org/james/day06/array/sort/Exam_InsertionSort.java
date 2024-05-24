package org.james.day06.array.sort;

public class Exam_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삽입정렬
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스값을 n-1번에서 0번 인덱스까지 비교~!
		// N은 1부터 시작
		// {2, 5, 4, 1, 3}
		// 첫번째 : 5와 2 비교 -> 교환 X
		// 첫번째 결과 : { 2, 5, 4, 1, 3}
		// 4와 비교 시작
		// 두번째 : 4와 5비교 -> 교환 
		// 			4와 2비교 -> 교환 X
		// 두번째 결과 : {2, 4, 5, 1, 3}
		// 세번째 : 1과 5비교 -> 교환
		//  		1과 4비교 -> 교환
		//  		1과 2 비교 -> 교환
		// 세번째 결과 : {1, 2, 4, 5, 3}
		// 네번째 : 3과 5비교 -> 교환
		//  		3과 4비교 -> 교환
		//  		3과 2비교 -> 교환 X
		//  		3과 1비교 -> 교환 X
		// 결과 : {1, 2, 3, 4, 5}
		int arrs [] = {2, 4, 5, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j >= 1; j--) {
				if(arrs[j-1] > arrs[j]) {
				int temp = arrs[j];
				arrs[j] = arrs[j-1];
				arrs[j-1] = temp;
				
				}
			}

			// 5 하고 2 비교, i가 1일때
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
			// 4하고 5비교, 4하고 2비교, i가 2일때
//			if(arrs[1] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[1];
//				arrs[1] = temp;
//			}
//			if(arrs[0] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[0];
//				arrs[0] = temp;
//			}
			// 1하고 4비교, 1하고, 5비교, 1하고 2비교
			// i가 3일때
//			if(arrs[2] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[2];
//				arrs[2] = temp;
//			}
//			if(arrs[1] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[1];
//				arrs[1] = temp;
//			}
//			if(arrs[1] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[0];
//				arrs[0] = temp;
//			}
			
		}
		// 정렬된 결과 출력
		for (int arr : arrs) {
			System.out.print(arr + " ");
		}
	}

}










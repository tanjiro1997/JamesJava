package org.james.day05.array;

public class Exam_HallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 복사 중 얕은복사
		int [] arrs = new int[4];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i*i;
		}
		// for-each문
		// 원래
		// for(int i = 0; i < arrs.length; i++)
		int [] copy = arrs; // 배열 얕은 복사
		copy[1]=11;			// 두번째값 변경
		for(int i : copy) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : arrs) {
			System.out.print(i + " ");
		}

	}

}

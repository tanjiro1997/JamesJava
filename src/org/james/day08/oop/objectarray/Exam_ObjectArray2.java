package org.james.day08.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {

	public static void main(String[] args) {
		// 여러개의 책이 존재하는데 그 책의 정보를 여러개 저장하려고 함.
		// 책은 3권까지 저장할 수 있도록 하고 제목과 저자만 입력받아 저장할 수 있는
		// 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		Book books [] = new Book[3];
		for(int i = 0; i < 3; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			books[i] = new Book(title,author);
		}
		for(Book book : books) {
			System.out.println(book.toString());
		}
//		for(int i = 0; i < 3; i++) {
//			books[i].showInfo();
//		}

	}

}

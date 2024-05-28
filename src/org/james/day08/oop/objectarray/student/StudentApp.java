package org.james.day08.oop.objectarray.student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		ManageStudent manage = new ManageStudent();
		Student student = new Student();
		ViewStudent view = new ViewStudent();
		end :
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1 :
//				manage.inputInfo();
				Student [] students = view.displayInput();
				manage.inputInfo(students);
				break;
			case 2 :
//				manage.printInfo();
				students = manage.printInfo();
				view.displayInfo(students);
				break;
			case 3 :
				view.displayMsg("프로그램을 종료합니다.");
				break end;
			default :
				view.displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
				
			}
		}
	}

	

	

	

}

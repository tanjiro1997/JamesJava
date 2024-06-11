package org.james.day12.collection.student;

import java.util.List;
import java.util.Map;

public class StudentRun {

	public static void main(String[] args) {
		ViewStudent view = new ViewStudent();
		ManageStudent mng = new ManageStudent();
		end:
		while(true) {
			int input = view.printMenu();
			switch (input) {
			case 1 : 
				Student std = view.inputStudent();
				mng.registerStudent(std); // 저장 끝
				break;
			case 2 : 
				String name = view.inputName("검색");
				List<Student> sList = mng.searchListByName(name);
				view.displayStudents(sList);
				break;
			case 3 : 
				List<Student> stdList = mng.selectAllStudents();
//				if(stdList != null)
//				if(!stdList.isEmpty())
				if(stdList.size() > 0)
					view.displayStudents(stdList);
				else
					view.displayMsg("회원정보가 없습니다");
				break;
			case 4 : 
				name = view.inputName("수정");
//				Student student = mng.searchModifyStudent(name);
//				student = view.modifyStudent(student);
				
//				int index = mng.searchIndexByName(name);
//				Student student = mng.searchModifyStudent(name);
				Map<String, Object> result = mng.searchModifyStudent(name);
				
				Student student = view.modifyStudent((Student)result.get("student"));
				mng.modifyStudent((int)result.get("index"), student);
				break;
			case 5 : 
				name = view.inputName("삭제");
				int index = mng.searchIndexByName(name);
				mng.deleteStudent(index);
				break;
			case 6 : 
				name = view.inputName("재평가 여부를 확인");
				student = mng.searchOneByName(name);
				String passResult = checkPass(student);
				view.displayMsg(passResult);
				break;
			case 0 : 
				view.displayMsg("프로그램을 종료합니다.");
				break end;
			default : 
				view.displayMsg("메뉴를 다시 선택해주세요.");
				break;
			}
		}
	}
	
	public static String checkPass(Student student) {
		int first = student.getFirstScore();
		int second = student.getSecondScore();
		// 평균이 60점이 넘으면 통과
		// 평균이 60점이 안되면 재평가
		double avg = (first+second)/(double)2;
		if(avg >= 60 ) {
			if(first < 40) {
				return "1차 시험 재평가";
			}else if(second < 40) {
				return "2차 시험 재평가";
			}else {
				return "모두 통과입니다.";
			}
		}else {
			String result = "";
			if(first < 60) {
				result += "1차 시험 재평가\n";
			}
			if(second < 60) {
				result += "2차 시험 재평가";
			}
			return result;
		}
	}

}

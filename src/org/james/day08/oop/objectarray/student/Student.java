package org.james.day08.oop.objectarray.student;

import java.util.Scanner;

public class Student {
	int firstScore;
	int secondScore;
	String name;
	
	public Student () {}
	
	public Student (String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	
	public String toString() {
		return this.name+" 학생의 첫번째 점수는 "+this.firstScore+"점, 두번째 점수는 "
			+this.secondScore+"점입니다.";
	}
}

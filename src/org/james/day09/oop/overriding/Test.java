package org.james.day09.oop.overriding;

class SuperClass {
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}
}

class SubSubClass extends SuperClass {
	void paint () {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("SubSub Object");
	}
}


public class Test {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}

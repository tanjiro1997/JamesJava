package org.james.day02.operator.exercise;

public class Quiz {
	public static void main(String[] args) {
	int a = 5;
	int b = 10;
	// a=5 b=10
	int c = (++a) + b;
	// a=6 b=10 c=16
	int d = c / a;
	// a=6 b=10 c=16 d=2
	int e = c % a;
	// a=6 b=10 c=16 d=2 e=4
	int f = e++;
	// a=6 b=10 c=16 d=2 e=5 f=4
	int g = (--b) + (d--);
	// a=6 b=9 c=16 d=1 e=5 f=4 g=11
	int h = 2;
	// a=6 b=9 c=16 d=1 e=5 f=4 g=11 h=2
	int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
	// a=7 b=9 c=15 d=1 e=6 f=4 g=10 h=2 i=6+9/(15/4)*(11-1)%(6+2)=12
	
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("c : " + c);
	System.out.println("d : " + d);
	System.out.println("e : " + e);
	System.out.println("f : " + f);
	System.out.println("g : " + g);
	System.out.println("h : " + h);
	System.out.println("i : " + i);

	}
}

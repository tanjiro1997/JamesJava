package org.james.day10.oop.abstractex.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator calc = new Calculator();
		Calculator calc = new GoodCalc();	// 업캐스팅
//		GoodCalc calculator = new GoodCalc();
		int [] nums = {5, 7, 10, 23};
		System.out.println("합 : " + calc.add(5, 7));
		System.out.println("차 : " + calc.substract(10, 23));
		System.out.println("평균 : " + calc.average(nums));
		

	}

}

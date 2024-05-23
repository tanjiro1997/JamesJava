package org.james.day05.random.excercise;

import java.util.Random;
import java.util.Scanner;

public class Excercise_Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동전 앞뒤 맞추기!
		// ==== 동전 앞 뒤 맞추기 ====
		// 숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
		// 맞췄습니다.
		// 숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
		// 틀렸습니다.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while(true) {
			System.out.print("숫자를 입력해주세요(1.앞면/ 2. 뒷면) : ");
			int choice = sc.nextInt();
			if(choice == -1) break;
//			int coin = rand.nextInt(2)+1; // 1 ~ 2 사이의 랜덤한 수
			int coin = (int)(Math.random()*2)+1;
			if(choice == coin) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다.");
				
			}
		}
	}

}

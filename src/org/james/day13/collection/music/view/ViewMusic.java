package org.james.day13.collection.music.view;

import java.util.List;
import java.util.Scanner;

import org.james.day13.collection.music.model.Music;

public class ViewMusic {
	
	private Scanner sc;
	
	public ViewMusic() {
		sc = new Scanner(System.in);
	}
	
	public int printMenu() {
//		Scanner sc = new Scanner(System.in);
		System.out.println("\n=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 정보수정");
		System.out.println("6. 특정 곡 삭제");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		return sc.nextInt();
	}

	public void printMsg(String msg) {
		System.out.println(msg);
		
	}

	public Music inputMusic() {
//		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}


	public void displayMusics(List<Music> musicList, String oneOrAll) {
		System.out.println("=== === " + oneOrAll + " 곡 목록 출력 === === ");
		for(Music mus : musicList) {
			System.out.printf("\t곡명 : %s\n", mus.getTitle());
			System.out.printf("\t가수명 : %s\n", mus.getSinger());
			System.out.println("==================================");
		}
		
	}

	public String inputTitle(String category) {
//		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 곡명을 입력해주세요 : ");
		String inputTitle = sc.next();
		return inputTitle;
	}

	public Music modifyMusic(Music music) {
		sc.nextLine();
		System.out.print("수정할 곡명 입력 : ");
		music.setTitle(sc.nextLine());
		System.out.print("수정할 가수명 입력 : ");
		music.setSinger(sc.nextLine());
		
		return music;
	}
}

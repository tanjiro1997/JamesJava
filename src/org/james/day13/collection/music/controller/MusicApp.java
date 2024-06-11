package org.james.day13.collection.music.controller;

import java.util.List;
import java.util.Map;

import org.james.day13.collection.music.model.ManageMusic;
import org.james.day13.collection.music.model.Music;
import org.james.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String [] args) {
		ViewMusic view = new ViewMusic();
		ManageMusic mng = new ManageMusic();
		
		end:
		while(true) {
			Music music = null;
			int input = view.printMenu();
			
			switch(input) {
			case 1 :
				music = view.inputMusic();
				mng.registerLast(music);
				break;
			case 2 : 
				music = view.inputMusic();
				mng.registerFirst(music);
				break;
			case 3 : 
				List<Music> musicList = mng.selectAllMusic();
				if(!musicList.isEmpty())
					view.displayMusics(musicList, "전체");
				else
					view.printMsg("정보가 존재하지 않습니다.");
				break;
			case 4 : 
				String title = view.inputTitle("검색");
				List<Music> mList = mng.searchOneByTitle(title);
				if(!mList.isEmpty()) {
					view.displayMusics(mList, "검색한");
				}else {
					view.printMsg("검색 결과가 없습니다.");
				}
				break;
			case 5 : 
				title = view.inputTitle("정보수정");
				Map<String, Object> result = mng.searchModifyMusic(title);
				music = view.modifyMusic((Music)result.get("music"));
				mng.modifyMusic((int)result.get("index"), music);
				break;
			case 6 :
				title = view.inputTitle("삭제");
				int index = mng.SearchIndexByTitle(title);
				mng.deleteMusic(index);
				view.printMsg(title + "을(를) 삭제하였습니다");
				break;
			case 7 :
				mng.sortByTitleASC();
				break;
			case 8 : 
				mng.sortByTitleDESC();
				break;
			case 9 : 
				mng.sortBySingerASC();
				break;
			case 10 : 
				mng.sortBySingerDESC();
				break;
			case 0 :
				view.printMsg("프로그램을 종료합니다.");
				break end;
			default :
				view.printMsg("다시 입력해주세요.");
				break;
			}
		}
	}
}

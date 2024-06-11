package org.james.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageMusic {
	private List<Music> mList;

	public ManageMusic() {
		mList = new ArrayList<Music>();
	}
	// 맨뒤에 곡 추가
	public void registerLast(Music music) {
		mList.add(music);

	}
	// 맨앞에 곡 추가
	public void registerFirst(Music music) {
		mList.add(0, music);

	}
	// 전체 곡 조회
	public List<Music> selectAllMusic() {
		return mList;
	}
	// 곡명으로 검색
	public List<Music> searchOneByTitle(String title) {
		if(title != "" && title != null) {
			List<Music> searchList = new ArrayList<Music>();
			for(Music mus : mList) {
				if(title.equals(mus.getTitle())) {
					searchList.add(mus);
				}
			}
			return searchList;
			
		}
		else	
			return null;
	}
	// 곡 삭제
	public void deleteMusic(int index) {
		mList.remove(index);
		
	}
	// 곡명으로 인덱스 검색
	public int SearchIndexByTitle(String title) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(title.equals(music.getTitle())) {
				return i;
			}
		}
		return 0;
	}
	// 정보변경할 곡 검색
	public Map<String, Object> searchModifyMusic(String title) {
		if(title != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for(int i = 0; i < mList.size(); i++) {
				Music music = mList.get(i);
				if(title.equals(music.getTitle())) {
					result.put("music", music);
					result.put("index", i);
				}
			}return result;
		}
		return null;
	}
	// 곡 정보변경
	public void modifyMusic(int i, Music music) {
		mList.set(i, music);
		
	}
	public void sortByTitleASC() {
//		List<String> strList = new ArrayList<String>();
//		strList.add("김만우");
//		strList.add("강진형");
//		strList.add("박은진");
//		Collections.sort(strList); // 기본 오름차순 정렬
		Collections.sort(mList);
//		// collection - list, set, map 크기 size()
//		for(int i = 0; i < mList.size(); i++) {
//			for(int j = 0; j < mList.size()-1-i; j++) {
//				// 버블 정렬의 특징 - 오른쪽부터 정렬됨, 비교횟수 줄어듬
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j+1);
//				// 문제점 : 객체비교는 부등호로는 무리
//				// 비교해야 하는 것은 곡명(title)
//				// title을 서로 비교하여 ㄱ보다 늦은 순서인 경우 교체
//				// 문자열 비교는 equals() *compareTo()
//				// 비교했을 때 왼쪽이 크면 맨 오른쪽으로 보내라 -> 오른쪽 큰놈들만 쌓임 -> 오름차순 정렬
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
////					Music temp = mOne;
////					mOne = mTwo;
////					mTwo = mOne;
//					mList.set(j, mTwo);
//					mList.set(j+1, mOne);
//				}
//			}
//		}
	}
	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
//		for(int i = 0; i < mList.size(); i++) {
//			for(int j = 0; j < mList.size()-1-i; j++) {
//				// 버블 정렬의 특징 - 오른쪽부터 정렬됨, 비교횟수 줄어듬
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j+1);
//				// 문제점 : 객체비교는 부등호로는 무리
//				// 비교해야 하는 것은 곡명(title)
//				// title을 서로 비교하여 ㄱ보다 늦은 순서인 경우 교체
//				// 문자열 비교는 equals()
//				// 비교했을 때 왼쪽이 작으면 맨 오른쪽으로 보내라 -> 작은 놈들만 쌓임 -> 내림차순 정렬
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
////					Music temp = mOne;
////					mOne = mTwo;
////					mTwo = mOne;
//					mList.set(j, mTwo);
//					mList.set(j+1, mOne);
//				}
//			}
//		}
		
	}
	public void sortBySingerASC() {
		
		
		
	}
	public void sortBySingerDESC() {
		
		
	}
}






















package org.james.day13.collection.music.model;

public class Music implements Comparable<Music>{
	// 곡명 title, 가수명 singer
	String title;
	String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.getTitle()); // 1, 0, -1
	}
	
	
}

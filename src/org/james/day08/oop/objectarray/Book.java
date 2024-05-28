package org.james.day08.oop.objectarray;

public class Book {
	String title;
	String author;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("(" + title + "," + author + ")");
	}
	public String toString() {
		return "("+this.title+","+this.author+")";
	}
	
}

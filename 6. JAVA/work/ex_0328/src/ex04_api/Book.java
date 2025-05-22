package ex04_api;

public class Book {
	String title = "";
	String author = "";
	public Book(String title, String author) {
	this.title = title;
	this.author = author;
	}
	
	@Override
	public String toString() {
	String Book = "책 제목 : " + this.title + ", 저자 : " + this.author;
		return Book;
	}
}

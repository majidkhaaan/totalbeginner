package org.totalbeginner.tutorial;

public class Book {

	public String title;
	public String author;
	private person personx;

	public Book(String string) {
		// TODO Auto-generated constructor stub
		this.title=string;
		this.author="unknown author";
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setPerson(person p2) {
		// TODO Auto-generated method stub
		this.personx = p2;
		
	}

	public person getPerson() {
		// TODO Auto-generated method stub
		return this.personx;
	}

}

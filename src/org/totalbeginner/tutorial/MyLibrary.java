package org.totalbeginner.tutorial;

import java.util.ArrayList;


public class MyLibrary {

	public String name;
	public ArrayList<Book> books;
	public ArrayList<person> people;

	public MyLibrary(String name) {

		this.name=name;
		books = new ArrayList<Book>();
		people = new ArrayList<person>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<person> getPeople() {
		return people;
	}
	public void addBook(Book b1) {
		this.books.add(b1);
	}

	public void removeBook(Book b1) {
		this.books.remove(b1);		
	}

	public void addPerson(person p1) {
		this.people.add(p1);
	}

	public void removePerson(person p1) {
		this.people.remove(p1);		
	}

	public boolean checkOut(Book b1, person p1) {

		if(b1.getPerson() == null){
			b1.setPerson(p1);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean checkIn(Book b1) {

		if(b1.getPerson() != null){
			b1.setPerson(null);
			return true;
		}
		else{
			return false;
		}
	}
	public ArrayList<Book> getBooksForPerson(person p1){
		ArrayList<Book> result = new ArrayList<Book>();
		for(Book aBook : this.getBooks()){
			if ((aBook.getPerson() != null) &&
					(aBook.getPerson().getName()
					.equals(p1.getName())))
				result.add(aBook);
		}
		return result;
	}
	
	public ArrayList<Book> getAvailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getPerson() == null) {
				result.add(aBook);
			}	
		}
		return result;
	}
		
	public ArrayList<Book> getUnavailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getPerson() != null) {
				result.add(aBook);
			}
		}
		return result;
	}
	
	public String toString() {
		return this.getName() + ": " +
				this.getBooks().size() + " books; " +
				this.getPeople().size() + " people.";
	}
	
	public static void main(String[] args){	
		
		System.out.println("bla bla bla");
		// create a new MyLibrary
		MyLibrary testLibrary = new MyLibrary("Test Drive Library");
		Book b1 = new Book("War And Peace");
		Book b2 = new Book("Great Expectations");
		b1.setAuthor("Tolstoy");
		b2.setAuthor("Dickens");
		person jim = new person();
		person sue = new person();
		jim.setName("Jim");
		sue.setName("Sue");
		testLibrary.addBook(b1);
		testLibrary.addBook(b2);
		testLibrary.addPerson(jim);
		testLibrary.addPerson(sue);
		System.out.println("Just created new library");
		testLibrary.printStatus();
		System.out.println("Check out War And Peace to Sue");
		testLibrary.checkOut(b1, sue);
		testLibrary.printStatus();
		System.out.println("Do some more stuff");
		testLibrary.checkIn(b1);
		testLibrary.checkOut(b2, jim);
		testLibrary.printStatus();
	}
	
	private void printStatus() {
		System.out.println("Status Report of MyLibrary \n" + this.toString());
		for (Book thisBook : this.getBooks()) {
			System.out.println(thisBook);
		}
		for (person p : this.getPeople()) {
			int count = this.getBooksForPerson(p).size();
			System.out.println(p + " (has " + count + " of my books)");
		}
		System.out.println("Books Available: "
				+ this.getAvailableBooks().size());
		System.out.println("--- End of Status Report ---");
	}
	
}

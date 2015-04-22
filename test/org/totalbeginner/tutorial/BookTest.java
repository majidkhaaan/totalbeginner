package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	public void testBook() {
		Book b1=new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
	}
	public void testGetPerson() {
		Book b2 = new Book("War and Peace");
		person p2 = new person();
		p2.setName("Elvis");
		//Method to say the book is loaned to this person
		b2.setPerson(p2);
		
		//Get the name of the person who has the book
		person testPerson = b2.getPerson();
		String testName = testPerson.getName();
			
		assertEquals("Elvis", testName);
		
		
	}
}

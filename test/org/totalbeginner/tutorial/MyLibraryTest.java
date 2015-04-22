package org.totalbeginner.tutorial;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {
	private Book b1;
	private Book b2;
	private person p1;
	private person p2;
	private MyLibrary ml;
	public void testMyLibrary() {
		MyLibrary ml = new MyLibrary("test");
		assertEquals("test", ml.name);
		assertTrue(ml.books instanceof ArrayList);
		assertTrue(ml.people instanceof ArrayList);
		
	}
	public void setup() {

		b1 = new Book("Book1");
		b2 = new Book("Book2");
		p1 = new person();
		p2 = new person();
		p1.setName("Fred");
		p2.setName("Sue");
		
		ml = new MyLibrary("Test");
		
	}
	public void testAddBook() {
		setup();
		assertEquals(0, ml.getBooks().size());
		ml.addBook(b1);
		ml.addBook(b2);
		assertEquals(2, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b1);
		
		assertEquals(1, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b2));		
		
	}
	public void testCheckOut() {
		setup();
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addPerson(p1);
		ml.addPerson(p2);
		
		assertTrue("Book did not check out correctly", ml.checkOut(b1,p1));
		
		assertEquals("Fred", b1.getPerson().getName());
		
		assertFalse("Book was already checked out", ml.checkOut(b1,p2));
		
		assertTrue("Book check in failed", ml.checkIn(b1));
		
		assertFalse("Book was already checked in", ml.checkIn(b1));
		
		assertFalse("Book was never checked out", ml.checkIn(b2));
	}
}

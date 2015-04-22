package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		person p1=new person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaximumBooks());
	}

	public void testSetName() {
		person p1 = new person();
		p1.setName("Fred");
		assertEquals("Fred", p1.getName());
	}

	public void testSetMaximumBooks() {
		person p2 = new person();
		p2.setMaximumBooks(5);
		assertEquals(5, p2.getMaximumBooks());
	}
	public void testToString() {
		person p4 = new person();
		p4.setMaximumBooks(4);
		p4.setName("Majid");
		String testString = "Majid (4 books)";
		assertEquals(p4.toString(), testString);
		
	}

}

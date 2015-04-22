package org.totalbeginner.tutorial;

public class person {
	//fields
	private String name;//name of the person
	private int maximumBooks; //most books he can check out
	// constructors
	public person() {
		name="unknown name";
		maximumBooks=3;
	}
	//methods
	public String getName() {
		return name;
	}
	public void setName(String anyName) {
		name=anyName;		
	}
	public int getMaximumBooks() {
		return maximumBooks;
	}
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	public String toString() {
		return this.getName() + " (" + this.getMaximumBooks() + " books)";
	}

}

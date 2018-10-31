package lab4;

public class Author {
	private String name;
	
	Author(String authorName) {
		name = authorName;
	}
	
	public void print() {
		System.out.println("Author: " + name);
	}
}

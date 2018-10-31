package lab3;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors = new ArrayList<Author>();
	private List<Element> content = new ArrayList<Element>();
	
	Book(String bookTitle) {
		title = bookTitle;
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public int addContent(Element elem) {
		content.add(elem);
		return content.indexOf(elem);
	}
	
	public void removeContent(Element elem) {
		content.remove(elem);
	}
	
	public Element getElement(int index) {
		if (index >= 0 && index < content.size()) {
			return content.get(index);
		}
		
		return null;
	}
	
	public void print() {
		System.out.println("Book: " + title);
		System.out.println();
		System.out.println("Authors: ");
		for (Author a : authors) {
			a.print();
		}
		System.out.println();
		for (Element elem : content) {
			elem.print();
		}
		
	}
}

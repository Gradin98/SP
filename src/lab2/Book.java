package lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors = new ArrayList<Author>();
	private List<Chapter> chapters = new ArrayList<Chapter>();
	
	Book(String bookTitle) {
		title = bookTitle;
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public int createChapter(String chapterName) {
		Chapter chp = new Chapter(chapterName);
		chapters.add(chp);
		
		return chapters.indexOf(chp);
	}
	
	public Chapter getChapter(int index) {
		if (index < 0 || index >= chapters.size()) {
			return null;
		}
		
		return chapters.get(index);
	}
	
	public void print() {
		System.out.println("Book: " + title);
		System.out.println();
		System.out.println("Authors: ");
		for (Author a : authors) {
			a.print();
		}
		System.out.println();
		for (Chapter chp : chapters) {
			chp.print();
		}
		
	}
}

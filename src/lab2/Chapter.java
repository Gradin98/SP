package lab2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private String name;
	private List<SubChapter> subChapters = new ArrayList<SubChapter>();
	
	Chapter(String chapterName) {
		name = chapterName;
	}
	
	public int createSubChapter(String subChapterName) {
		SubChapter sc = new SubChapter(subChapterName);
		subChapters.add(sc);
		
		return subChapters.indexOf(sc);
	}
	
	public SubChapter getSubChapter(int index) {
		if (index < 0 || index >= subChapters.size()) {
			return null;
		}
		return subChapters.get(index);
	}
	
	public void print() {
		System.out.println("Chapter " + name);
		for (SubChapter sc : subChapters) {
			sc.print();
		}
	}
	
}

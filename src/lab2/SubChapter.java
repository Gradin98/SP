package lab2;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<Element> content = new ArrayList<Element>();
	
	SubChapter(String subChapterName) {
		name = subChapterName;
	}
	
	int createNewParagraph(String paragraphText) {
		Paragraph p = new Paragraph(paragraphText);
		content.add(p);
		
		return content.indexOf(p);
	}
	
	int createNewImage(String imageName) {
		Image img = new Image(imageName);
		content.add(img);
		
		return content.indexOf(img);
	}
	
	int createNewTable(String tableName) {
		Table tbl = new Table(tableName);
		content.add(tbl);
		
		return content.indexOf(tbl);
	}
	
	public void print() {
		System.out.println("Subchapter: " + name);
		for(Element elem : content) {
			elem.print();
		}
	}
	
}

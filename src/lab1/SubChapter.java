package lab1;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<Paragraph> paragraphs = new ArrayList<Paragraph>();
	private List<Image> images = new ArrayList<Image>();
	private List<Table> tables = new ArrayList<Table>();
	
	SubChapter(String subChapterName) {
		name = subChapterName;
	}
	
	int createNewParagraph(String paragraphText) {
		Paragraph p = new Paragraph(paragraphText);
		paragraphs.add(p);
		
		return paragraphs.indexOf(p);
	}
	
	int createNewImage(String imageName) {
		Image img = new Image(imageName);
		images.add(img);
		
		return images.indexOf(img);
	}
	
	int createNewTable(String tableName) {
		Table tbl = new Table(tableName);
		tables.add(tbl);
		
		return tables.indexOf(tbl);
	}
	
	public void print() {
		System.out.println("Subchapter: " + name);
		for(Paragraph p : paragraphs) {
			p.print();
		}
		
		for(Image img : images) {
			img.print();
		}

		for(Table t : tables) {
			t.print();
		}
	}
	
}

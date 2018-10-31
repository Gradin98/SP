package lab2;

public class Paragraph extends Element {
	private String text;
	
	Paragraph(String paragraphText) {
		text = paragraphText;
	}
	
	public void print() {
		System.out.println("Paragraph: " + text);
	}
	

}

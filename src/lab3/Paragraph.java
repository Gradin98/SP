package lab3;

public class Paragraph implements Element {
	private String text;
	
	Paragraph(String paragraphText) {
		text = paragraphText;
	}
	
	public void print() {
		System.out.println("Paragraph: " + text);
	}
	
	public int add(Element elem) throws Exception {
		throw new Exception("Not supported by Leaf Elements.");
	}

	public void remove(Element elem) throws Exception {
		throw new Exception("Not supported by Leaf Elements.");
		
	}

	public Element getElement(int index) throws Exception {
		throw new Exception("Not supported by Leaf Elements.");
	}
}

package lab4;

public class Paragraph implements Element {
	private String text;
	private Align align;
	
	Paragraph(String paragraphText) {
		text = paragraphText;
	}
	
	
	
	public Align getAlign() {
		return align;
	}

	public void setAlign(Align align) {
		this.align = align;
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

	@Override
	public void print() {
		if(align != null)
			align.print(text);
		else {
			System.out.println(text);
		}
	}
}

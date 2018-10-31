package lab4;

public class ParagraphRight extends Paragraph implements Align {

	ParagraphRight(String paragraphText) {
		super(paragraphText);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String text) {
		System.out.println("+++++" + text);
		
	}
	
}

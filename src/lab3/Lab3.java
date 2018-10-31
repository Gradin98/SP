package lab3;

public class Lab3 {

	public static void main(String[] args) throws Exception {
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila......"));
		noapteBuna.addContent(cap1);
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(cap111);
		cap11.add(new Paragraph("Text from subchapter 1.1"));
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));

		noapteBuna.print();
	}

}

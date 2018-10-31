package lab4;

public class ImageProxy implements Element {
	private String imageName;
	private Image realImage = null;
	
	ImageProxy(String name) {
		imageName = name;
	}
	
	public void print() {
		if (realImage == null) {
			realImage = new Image(imageName);
		}
		realImage.print();
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

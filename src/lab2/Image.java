package lab2;

public class Image extends Element {
	private String imageName;
	
	Image(String name) {
		imageName = name;
	}
	
	public void print() {
		System.out.println("Image with name:" + imageName);
	}
}

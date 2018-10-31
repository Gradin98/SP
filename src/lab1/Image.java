package lab1;

public class Image {
	private String imageName;
	
	Image(String name) {
		imageName = name;
	}
	
	public void print() {
		System.out.println("Image with name:" + imageName);
	}
}

package lab2;

public class Table extends Element {

	private String title;
	
	Table(String tableTitle) {
		title = tableTitle;
	}
	
	public void print() {
		System.out.println("Table with Title: " + title);
	}
}


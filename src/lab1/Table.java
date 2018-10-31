package lab1;

public class Table {

	private String title;
	
	Table(String tableTitle) {
		title = tableTitle;
	}
	
	public void print() {
		System.out.println("Table with Title: " + title);
	}
}


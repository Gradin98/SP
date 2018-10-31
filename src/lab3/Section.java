package lab3;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
	public String title;
	public List<Element> content = new ArrayList<Element>();
	
	Section(String sectionTitle) {
		title = sectionTitle;
	}
	
	public int add(Element elem) throws Exception {
		content.add(elem);
		return content.indexOf(elem);
	}

	public void remove(Element elem) throws Exception {
		content.remove(elem);
	}

	public Element getElement(int index) throws Exception {
		if (index >= 0 && index < content.size()) {
			return content.get(index);
		}
		return null;
	}
	@Override
	public void print() {
		System.out.println(title);
		for (Element elem : content) {
			elem.print();
		}
	}
}

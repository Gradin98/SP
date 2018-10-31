package lab4;

public interface Element {

	public int add(Element elem) throws Exception;
	public void remove(Element elem) throws Exception;
	public Element getElement(int index) throws Exception;
	public abstract void print();
}

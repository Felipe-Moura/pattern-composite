package composite;

import java.util.ArrayList;

public class Composite extends MyComponent{

	public ArrayList<MyComponent> list = new ArrayList();
	
	public Composite(String newText) {
		super(newText);
	}
	
	public void addText(MyComponent newText) {
		list.add(newText);
	}
	
	public ArrayList<MyComponent> getTextList() {
		return list;
	}
	
	public void printText() {
		System.out.println(getText());
	}
	
}

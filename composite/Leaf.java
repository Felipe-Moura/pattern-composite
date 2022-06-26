package composite;

public class Leaf extends MyComponent{

	public Leaf(String newText) {
		super(newText);
	}
	
	public void printText() {
		System.out.println(getText());
	}

}

import composite.Composite;
import composite.Leaf;
import composite.MyComponent;

public class Main {

	public static void main(String[] args) {
		
		MyComponent aux;

		Composite comp1 = new Composite("First Composite");
		Composite comp2 = new Composite("Second Composite");
		
		Leaf leaf1 = new Leaf("First Leaf");
		Leaf leaf2 = new Leaf("Second Leaf");
		Leaf leaf3 = new Leaf("Third Leaf");
		
		comp1.addText(leaf1);
		comp1.addText(comp2);
		comp2.addText(leaf2);
		comp2.addText(leaf3);
		
		comp1.printText();
		aux = comp1.list.get(0);
		aux.printText();
		aux = comp1.list.get(1);
		aux.printText();
		aux = comp2.list.get(0);
		aux.printText();
		aux = comp2.list.get(1);
		aux.printText();
		
	}

}

package composite;

public abstract class MyComponent {

	private String text;
	
	public MyComponent(String newText) {
		this.text = newText;
	}
	
	public String getText() {
		
		return this.text;
		
	}
	
	public void setText(String newText) {
		
		this.text = newText;
		
	}
	
	public void printText() {
		System.out.println(getText());
	}
	
}

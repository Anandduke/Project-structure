package trail;
public class Circle extends Shape {
	private int a;
	
	public Circle(int a) {
		super();
		this.a = a;
	}
	public double calculateArea()
	{
		return Math.PI * 2 *a;
	}
	public String toString() {
		return "Square [a=" + a + ", shapeName=" + shapeName + ", calculateArea()=" + calculateArea() + "]";
	}
	

}

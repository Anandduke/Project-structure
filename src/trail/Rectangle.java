package trail;

public class Rectangle extends Shape {
	private int a,b,c;

	public Rectangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calculateArea() {
		// TODO Auto-generated method stub
		return a*b*c;
	}

	public String toString() {
		return "Rectangle a=" + a + ", b=" + b + ", c=" + c + ", calculateArea()=" + calculateArea() + "";
	}
	

}

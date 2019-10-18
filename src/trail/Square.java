package trail;

public class Square extends Shape {
	private int side;

	public Square(int side) {
		super();
		shapeName="Square";
		this.side = side;
	}
public double calculateArea()
{
	return side*side;
	}
public String toString() {
	return "Square [side=" + side + ", shapeName=" + shapeName + ", calculateArea()=" + calculateArea() + "]";
}


}

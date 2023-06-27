package Q5;
abstract class Shape{
	abstract void RectangleArea(double l,double b);
	abstract void SquareArea(double s);
	abstract void CircleArea(double r);
}
class Area extends Shape{

	@Override
	void RectangleArea(double l,double b) {
		System.out.println("Area of Rectangle :"+l*b);
		
	}

	@Override
	void SquareArea(double s) {
		System.out.println("Area of Square :"+s*s);
		
	}

	@Override
	void CircleArea(double r) {
		System.out.println("Area of Circle : "+2*3.14*r);
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		Area a=new Area();
		a.RectangleArea(1,5);
		a.SquareArea(3);
		a.CircleArea(4);
	}

}

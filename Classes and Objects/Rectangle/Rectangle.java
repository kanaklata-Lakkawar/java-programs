
public class Rectangle {
	int length,breadth;
	
	Rectangle(int l, int b)
	{
	 length=l;
	 breadth=b;
	}
int Area()
{
	int area=length*breadth;
	System.out.println("Area of Rectangle : "+area);
	return area;	
}
}

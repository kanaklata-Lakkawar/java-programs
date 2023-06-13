package Area;

public class Area {
	int length,breadth;
	Area(int l,int b)
	{
	 length=l;
	 breadth=b;
	}
int ReturnArea()
{
	int area=length*breadth;
	System.out.println("Area of Reactangle : "+area);
	return area;
}
}

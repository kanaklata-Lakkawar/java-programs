import java.util.Scanner;

public class Area{
	int length,breadth,area;
	Scanner sc=new Scanner(System.in);
	Area(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void setDim(){
		System.out.println("length : "+length);
		System.out.println("breadth : "+breadth);
	}
	int getArea(){
		area=length*breadth;
		System.out.println(area);
	    return area;
		}
}

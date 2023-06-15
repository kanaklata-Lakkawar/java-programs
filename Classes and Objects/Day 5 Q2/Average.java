
public class Average {
	int num1,num2,num3;
	Average(int n1,int n2,int n3)
	{
		num1=n1;
		num2=n2;
		num3=n3;
	}
	void calculate()
	{
		int avg=(num1+num2+num3)/3;
		System.out.println("Average : "+avg);
	}

}

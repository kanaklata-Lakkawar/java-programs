
public class EmployeeMain {

	public static void main(String[] args) {
Employees e[]=new Employees[2];
for(int i=0;i<e.length;i++)
{
	e[i]=new Employees();
	
	e[i].setData();
	System.out.println("Employee : "+(i+1));
	e[i].getData();
}
		}

	}




public class StudentMain {

	public static void main(String[] args) {
		Student s[]=new Student[2];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			s[i].setData();
			System.out.println("Student "+(i+1));
			s[i].getData();
		}

	}

}

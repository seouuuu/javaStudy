import java.util.Scanner;
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}

class StudentTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s;
		s = new Student();
		s.name = "ȫ�浿";
		System.out.println(s.name);
	}
}

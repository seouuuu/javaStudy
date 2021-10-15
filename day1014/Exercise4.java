class Student
{
	private int number;
	public String name;

	public void setNumber(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public Student(){
	}
}


class GraduateStudent extends Student 
{
	public String lab;

	public void setLab(String lab){
		this.lab = lab;
	}
	public String getLab(){
		return lab;
	}
	public GraduateStudent(){
		super();
	}
}

class Exercise4
{
	public static void main(String[] args) 
	{
		GraduateStudent s = new GraduateStudent();
		s.setNumber(10);
		s.setLab("Image Processing Lab");
		s.setName("홍길동");

		System.out.println(s.getNumber());
		System.out.println(s.getLab());
		System.out.println(s.getName());
	}
}


//1. 위의 코드에서 수퍼 클래스는 Student이고 서브 클래스는 GraduateStudent 이다.

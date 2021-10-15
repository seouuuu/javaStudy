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
	/*
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	*/
	//private영역에 있는 것은 setter,getter 만들어야 하지만
	//public영역에 있는 것은 만들어도 되고 안만들어도 됨

	public Student(int number,String name){
		this.number = number;
		this.name = name;
	}
	public Student(){
	}
}

class GraduateStudent extends Student 
{
	public String lab;

	public GraduateStudent(int number,String name, String lab){
		super(number,name);
		this.lab = lab;
	}
	public GraduateStudent(){
		super();
	}
}

class Exercise04 
{
	public static void main(String[] args) 
	{
		GraduateStudent s = new GraduateStudent();
		s.setNumber(10);
		//number는 private이기때문에 set으로 접근
		s.lab = "Image Processing Lab";
		s.name ="홍길동";
		//lab과 name은 public 접근명시자여서 외부의 클래스가 접근 가능 
	}
}

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
	//private������ �ִ� ���� setter,getter ������ ������
	//public������ �ִ� ���� ���� �ǰ� �ȸ��� ��

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
		//number�� private�̱⶧���� set���� ����
		s.lab = "Image Processing Lab";
		s.name ="ȫ�浿";
		//lab�� name�� public ���ٸ���ڿ��� �ܺ��� Ŭ������ ���� ���� 
	}
}

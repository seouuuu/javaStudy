class Human
{
	String name;
	int age;

	public Humna(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	punlic String toString(){
		return "�̸�:"+name+", ����:"+age+"��";
	}

	public static void main(String[] args) 
	{
		Human h1 = new Human("����",18);
		Human h2 = new Human("����",21);
		Human h3 = new Human("���",50);

		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}

class Student extends Human
{
	String major;

	public Student(String name,int age, String major){
		super(name,age);
		this.major = major;
	}
	public void setMajor(String major){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	public String toString(){
		return super.Human()+", ����:"+major;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("����",21,"��ǻ��");
		Student s2 = new Student("����",22,"�濵");
		Student s3 = new Student("����",24,"����");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}




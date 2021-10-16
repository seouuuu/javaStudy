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
		return "이름:"+name+", 나이:"+age+"세";
	}

	public static void main(String[] args) 
	{
		Human h1 = new Human("춘향",18);
		Human h2 = new Human("몽룡",21);
		Human h3 = new Human("사또",50);

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
		return super.Human()+", 전공:"+major;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("명진",21,"컴퓨터");
		Student s2 = new Student("미현",22,"경영");
		Student s3 = new Student("용준",24,"경제");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}




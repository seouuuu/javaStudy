class Student
{
	protected String name;
	protected String number;
	protected String major;
	protected int grade;
	protected double credits;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public String getNumber(){
		return number;
	}
	public void setMajor(String Major){
		this.major=major;
	}
	
	public void setGrade(String grade){
		this.grade = grade;
	}
	
	public void setCredits(String credits){
		this.credits=credits;
	}
	public String getCredits(){
		return credits;

	public Student(String name,String number,String major,int grade,double credits){
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.credits = credits;
	}

	public Student(){
	}
}


class StudentTest 
{
	public static void main(String[] args) 
	{
		
	}
}

class Student
{
	protected String name;
	protected String major;
	protected String grade;
	protected String credits;

	public Student(){
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setMajor(String Major){
		this.major=major;
	}
	public String getMajor(){
		return major;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	public String getGrade(){
		return grade;
	}
	public void setCredits(String credits){
		this.credits=credits;
	}
	public String getCredits(){
		return credits;
	}
	public String toString(){
		return "�̸�:"+name+",����:"+major+",�г�:"+grade+",�̼�����:"+credits;
	}
}

class UnderGraduate extends Student
{
	protected String club;

	public UnderGraduate(){
	}
	public void setClub(String club){
		this.club = club;
	}
	public void getClub(){
		return club;
	}
	public String toString(){
		return super.toString() +",���Ƹ�:"+club;
	}
}
class Graduate extends Student
{
	protected String assi;
	protected double rate;

	public Graduate(){
	}

	public void setAssi(String assi){
		this.assi=assi;
	}
	public String getAssi(){
		return assi;
	}
	public void setRate(double rate){
		this.rate =rate;
	}
	public double getRate(){
		return rate;
	}
	public String toString(){
		return super.toString() +",����:"+assi+",���бݺ���:"+rate; 
	}
}


class Programming7 
{
	public static void main(String[] args) 
	{
		Student s= new Student();
		s.setName("ȫ�浿");
		s.setMajor("�濵�а�");
		s.setGrade("3");
		s.setCredits("120");
		s.setClub("���絿�Ƹ�");
		System.out.println(s);

	}
}

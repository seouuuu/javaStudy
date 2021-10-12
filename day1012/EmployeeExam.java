class Employee
{
	private int number;
	private String name;
	private int salary;
	private String day;
	private String team;
	public Employee(int number,String name, int salary, String day, String team){
		this.number = number;
		this.name = name;
		this.salary = salary;
		this.day = day;
		this.team = team;
	}
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
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	public void setDay(String day){
		this.day = day;
	}
	public String getDay(){
		return day;
	}
	public void setTeam(String team){
		this.team = team;
	}
	public String getTeam(){
		return team;
	}
	public String toString(){
		String result = "";
		result +="사원번호: "+number+"\n";
		result +="사원명: "+name+"\n";
		result +="급여: "+salary+"\n";
		result +="입사일: "+day+"\n";
		result +="부서명: "+ team+"\n";
		return result;
	}
}
class EmployeeExam
{
	public static void main(String[] args) 
	{
		Employee e = new Employee(202112,"홍길동",300,"2021/10/12","총무팀");
		System.out.println(e);
	}
}

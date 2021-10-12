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
		result +="�����ȣ: "+number+"\n";
		result +="�����: "+name+"\n";
		result +="�޿�: "+salary+"\n";
		result +="�Ի���: "+day+"\n";
		result +="�μ���: "+ team+"\n";
		return result;
	}
}
class EmployeeExam
{
	public static void main(String[] args) 
	{
		Employee e = new Employee(202112,"ȫ�浿",300,"2021/10/12","�ѹ���");
		System.out.println(e);
	}
}

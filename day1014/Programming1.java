class Employee
{
	protected String name;
	protected String number;

	public Employee(){		
	}
	public Employee(String name,String number){
		this.name = name;
		this.number = number;
	}

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
	public int computeSalary(){
		return 0;
	}
	public String toString(){
		return "이름:"+name+", 번호:"+number+", 월급:"+computeSalary();
	}
	
}

class SalariedEmployee extends Employee
{
	private int salary;

	public SalariedEmployee(String name,String number,int salary){
		super(name,number);
		this.salary = salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	public int computeSalary(){
		return super.computeSalary()+salary;
	}
}

class HourlyEmployee extends Employee
{
	private int hourly;
	private int hour;

	public HourlyEmployee(String name,String number,int hourly,int hour){
		super(name,number);
		this.hourly = hourly;
		this.hour = hour;
	}
	public void setHourly(int hourly){
		this.hourly = hourly;
	}
	public int getHourly(){
		return hourly;
	}
	public void setHour(int hour){
		this.hour = hour;
	}
	public int getHour(){
		return hour;
	}
	public int computeSalary(){
		return super.computeSalary()+ (hourly*hour);
	}
}

class Programming1
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("홍길동","A123");
		System.out.println(e);

		SalariedEmployee s = new SalariedEmployee("이순신","A456",3000000);
		System.out.println(s);

		HourlyEmployee h = new HourlyEmployee("강감찬","A789",20000,5);
		System.out.println(h);
	}
}

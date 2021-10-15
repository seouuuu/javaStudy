class Employee
{
	protected String name;
	protected String no;
	protected int salary;
	public Employee(String name,String no){
		this.name = name;
		this.no = no;
	}
	public Employee(){
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNo(String no){
		this.no = no;
	}
	public int getSalary(){
		return salary;
	}
	public void computeSalary(){	
	}
	public String toString(){
		return "이름:"+name+",사원번호:"+no+",급여:"+salary;
	}
}

class SalariedEmployee extends Employee
{
	private int grade;//호봉
	private int base;//기본금
	private int allowance;//수당

	public SalariedEmployee(String name,String no,int grade){
		super(name,no);
		this.grade = grade;
	}
	public SalariedEmployee(){
	}
	public void setGrade(int grade){
		this.grade = grade;
	}
	public int getGrade(){
		return grade;
	}
	public int getBase(){
		return base;
	}
	public int getAllowance(){
		return allowance;
	}
	public void computeSalary(){ 
		//호봉에 따라 기본금과 수당 결정
		//1: 200,50
		//2: 250,80
		//3: 300,100
		switch(grade){
			case 1: base=200;allowance=50;break;
			case 2: base=250;allowance=80;break;
			case 3: base=300;allowance=100;break;
		}
		salary = base + allowance;
	}
	public String toString(){
		return super.toString()+",호봉:"+grade+",기본금:"+base+",수당:"+allowance;
	}
}

class HourlyEmployee extends Employee
{
	private int base; //시간당 임금
	private int time; //일한 시간

	public HourlyEmployee(String name,String no,int base,int time){
		super(name,no);
		this.base = base;
		this.time = time;
	}
	public void setBase(int base){
		this.base = base;
	}
	public int getBase(){
		return base;
	}
	public void setTime(int time){
		this.time = time;
	}
	public int getTime(){
		return time;
	}
	public void computeSalary(){
		//급여 = 시간당 임금 * 일한 시간
		salary = base * time;
	}
	public String toString(){
		return super.toString()+ ",시간당 임금:"+base +",일한 시간:"+time;
	}
}


class EmployeeTest 
{
	public static void main(String[] args) 
	{
		SalariedEmployee e1 = new SalariedEmployee("홍길동","A123",2);
		HourlyEmployee e2 = new HourlyEmployee("이순신","B187",50000,5);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println("========================");
		e1.computeSalary();
		e2.computeSalary();
		System.out.println(e1);
		System.out.println(e2);
	}
}

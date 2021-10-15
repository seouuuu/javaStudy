import java.util.Scanner;

//추상메소드를 포함하고 있으므로 추상클래스가 되어야함
abstract class Employee   //추상클래스
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
	public abstract void computeSalary()	  //추상메소드

	public String toString(){
		return "이름:"+name+",사원번호:"+no+",급여:"+salary;
	}
}

class SalariedEmployee extends Employee
{
	private int grade;
	private int base;
	private int allowance;

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
	private int base; 
	private int time; 

	public HourlyEmployee(String name,String no,int base,int time){
		super(name,no);
		this.base = base;
		this.time = time;
	}
	public HourlyEmployee(){
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
	/*
	public void computeSalary(){
		
		salary = base * time;
	}
	*/
	public String toString(){
		return super.toString()+ ",시간당 임금:"+base +",일한 시간:"+time;
	}
}

class EmployeeTestAbstractNoOverriding
{
	public static void main(String[] args) 
	{
		Employee e1;
		Scanner sc = new Scanner(System.in);
		int type;
		String name,no;

		do{
		System.out.print("사원의 종류를 입력하세요. 1:월급제, 2.시간제==>");
		type = sc.nextInt();
		}while(type!=1 && type!=2);

		System.out.print("사원의 이름을 입력하세요==>");
		name = sc.next();
		System.out.print("사원번호를 입력하세요==>");
		no = sc.next();

		if(type==1){
				int grade;
				System.out.print("사원의 호봉을 입력하세요==>");
				grade = sc.nextInt();
				e1 = new SalariedEmployee(name,no,grade);
		}else {
				int base,time;
				System.out.print("시간당 임금을 입력하세요==>");
				base = sc.nextInt();
				System.out.print("일한 시간을 입력하세요==>");
				time = sc.nextInt();
				e1 = new HourlyEmployee(name,no,base,time);
		}
				e1.computeSalary();
				System.out.println(e1);
	}
}

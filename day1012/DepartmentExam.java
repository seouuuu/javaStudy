class Department
{
	private int number;
	private String name;
	private String location;
	public Department(){
		number = 3;
		name = "총무부";
		location = "5층";
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
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return location;
  }
	public String toString(){
		String result = "";
		result += "부서번호: " + number + "\n";
		result += "부서명: " + name + "\n";
		result += "부서위치: " + location + "\n";
		return result;
	}
}
class DepartmentExam
{
	public static void main(String[] args) 
	{
		Department d = new Department();
		System.out.println(d);
		d.setNumber(2);
		d.setName("감사부");
		d.setLocation("2층");
		System.out.println(d);
	}
}

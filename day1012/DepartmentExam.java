class Department
{
	private int number;
	private String name;
	private String location;
	public Department(){
		number = 3;
		name = "�ѹ���";
		location = "5��";
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
		result += "�μ���ȣ: " + number + "\n";
		result += "�μ���: " + name + "\n";
		result += "�μ���ġ: " + location + "\n";
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
		d.setName("�����");
		d.setLocation("2��");
		System.out.println(d);
	}
}

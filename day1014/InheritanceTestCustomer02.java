class Person
{
	private String name;
	private String addr;
	private String phone;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
}

class Customer extends Person
{
	private String number;
	private double mileage;
	public void setNumber(String number){
		this.number = number;
	}
	public String getNumber(){
		return number;
	}
	public void setMileage(double mileage){
		this.mileage = mileage;
	}
	public double getMileage(){
		return mileage;
	}
}

class InheritanceTestCustomer02 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		c.setName("ȫ�浿");
		c.setAddr("�뱸�� �ϱ� ������ 1234");
		c.setPhone("016-1234-5678");
		c.setNumber("A1234");
		c.setMileage(1000);
		System.out.printf("���̸�: %s\n",c.getName());
		System.out.printf("���ּ�: %s\n",c.getAddr());
		System.out.printf("����ȭ: %s\n",c.getPhone());
		System.out.printf("����ȣ: %s\n",c.getNumber());
		System.out.printf("�����ϸ���: %.1f\n",c.getMileage());
	}
}

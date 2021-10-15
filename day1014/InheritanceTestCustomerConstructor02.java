class Person
{
	protected String name;
	protected String addr;
	protected String phone;
	public Person(String name, String addr, String phone){
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
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
	public Customer(String name,String addr,String phone,String number,double mileage){
		  
		this.number = number;
		this.mileage = mileage;
	}
	public Customer(){
	}
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
	public void printCustomer(){
		System.out.printf("�̸�:%s\n",name);
		System.out.printf("�ּ�:%s\n",addr);
		System.out.printf("��ȭ:%s\n",phone);
		System.out.printf("��ȣ:%s\n",number);
		System.out.printf("���ϸ���:%.1f\n",mileage);
	}
}

class InheritanceTestCustomerConstructor02 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer("ȫ�浿","����","011-1234-5678","A123",10000);
		c.printCustomer();
	}
}

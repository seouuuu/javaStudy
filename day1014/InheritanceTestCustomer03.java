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
	public void printCustomer(){
		System.out.printf("绊按捞抚: %s\n",name);
		System.out.printf("绊按林家: %s\n",addr);
		System.out.printf("绊按傈拳: %s\n",phone);
		System.out.printf("绊按锅龋: %s\n",number);
		System.out.printf("绊按付老府瘤: %.1f\n",mileage);
	}
}

class InheritanceTestCustomer03 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		c.setName("全辨悼");
		c.setAddr("措备矫 合备 汗泅悼 1234");
		c.setPhone("016-1234-5678");
		c.setNumber("A1234");
		c.setMileage(1000);
		
		c.printCustomer();
	}
}

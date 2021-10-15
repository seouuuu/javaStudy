class Person
{
	String name;
	String addr;
	String phone;
}
class Customer extends Person
{
	String number;
	double mileage;
}


class InheritanceTestCustomer 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		c.name = "全辨悼";
		c.addr = "措备矫 合备 汗泅悼 1234";
		c.phone = "016-1234-5678";
		c.number = "A1234";
		c.mileage = 1000;
		System.out.printf("绊按捞抚: %s\n",c.name);
		System.out.printf("绊按林家: %s\n",c.addr);
		System.out.printf("绊按傈拳: %s\n",c.phone);
		System.out.printf("绊按锅龋: %s\n",c.number);
		System.out.printf("绊按付老府瘤: %.1f\n",c.mileage);
	}
}

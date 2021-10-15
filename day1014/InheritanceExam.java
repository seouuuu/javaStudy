class Person
{
	String name;
	String addr;
	String phonenum;
}
class Customer extends Person
{
	String cusnum;
	int mile;
}

class InheritanceExam 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		c.name = "홍길동";
		c.addr = "제주";
		c.phonenum = "0161111111";
		c.cusnum = "100200";
		c.mile = 10000;

		System.out.println("이름: "+c.name);
		System.out.println("주소: "+c.addr);
		System.out.println("전화번호: "+c.phonenum);
		System.out.println("고객번호: "+c.cusnum);
		System.out.println("마일리지: "+c.mile);
	}
}

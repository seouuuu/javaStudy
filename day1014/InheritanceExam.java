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
		c.name = "ȫ�浿";
		c.addr = "����";
		c.phonenum = "0161111111";
		c.cusnum = "100200";
		c.mile = 10000;

		System.out.println("�̸�: "+c.name);
		System.out.println("�ּ�: "+c.addr);
		System.out.println("��ȭ��ȣ: "+c.phonenum);
		System.out.println("����ȣ: "+c.cusnum);
		System.out.println("���ϸ���: "+c.mile);
	}
}

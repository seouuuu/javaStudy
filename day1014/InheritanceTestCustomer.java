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
		c.name = "ȫ�浿";
		c.addr = "�뱸�� �ϱ� ������ 1234";
		c.phone = "016-1234-5678";
		c.number = "A1234";
		c.mileage = 1000;
		System.out.printf("���̸�: %s\n",c.name);
		System.out.printf("���ּ�: %s\n",c.addr);
		System.out.printf("����ȭ: %s\n",c.phone);
		System.out.printf("����ȣ: %s\n",c.number);
		System.out.printf("�����ϸ���: %.1f\n",c.mileage);
	}
}

class Person
{
	String name;
	int age;
	char gender;

	void eat(String food){
		System.out.printf("������ %c�� %d�� %s��(��) %s�� �Ծ��\n",gender,age,name,food);
	}

	void sleep(){
		System.out.printf("������ %c�� %d�� %s��(��) �ڰ� �־��\n",gender,age,name);
	}
}
class PersonTest02 
{
	public static void main(String[] args) 
	{
		Person p;
		p =new Person();
		p.name ="ȫ�浿";
		p.age = 26;
		p.gender = '��';
		p.eat("ġŲ");
		p.sleep();

		Person kim = new Person();
		kim.name = "��浿";
		kim.age = 23;
		kim.gender = '��';
		kim.eat("����");
		kim.sleep();

	}
}

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

class PersonTest 
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

	}
}

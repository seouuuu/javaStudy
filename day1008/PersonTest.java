class Person
{
	String name;
	int age;
	char gender;

	void eat(String food){
		System.out.printf("성별이 %c인 %d살 %s가(이) %s를 먹어요\n",gender,age,name,food);
	}

	void sleep(){
		System.out.printf("성별이 %c인 %d살 %s가(이) 자고 있어요\n",gender,age,name);
	}
}

class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p;
		p =new Person();
		p.name ="홍길동";
		p.age = 26;
		p.gender = '남';
		p.eat("치킨");
		p.sleep();

	}
}

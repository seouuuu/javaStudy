class Dog
{
	private String name;
	private String breed;
	private int age;
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void setName(){}
	public Dog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public String toString(){
		return "�̸�: "+name +", ���� : "+breed +", ����: "+age; 
	}
}


class DogExam
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("����",3);
		System.out.println(d1);
		Dog d2 = new Dog("�Ǹ�","Ǫ��",5);
		System.out.println(d2);
	}
}

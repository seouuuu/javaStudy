class Dog
{
	private String name;
	private int age;
	public String breed;

	public Dog(String name,String breed,int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public Dog(String name, int age){
		this(name,null,age);
	}
	public String toString(){
		return "�������̸�: " +name+", ����������: "+breed+", ����: "+age;
	}

}



class DogTest 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("��ġ",2);
		Dog d2 = new Dog("����","Ǫ��",3);
		System.out.println(d1);
		System.out.println(d2);

	}
}

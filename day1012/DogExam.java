class Dog
{
	private String name;
	private String breed;
	private int age;
	
	public void setName(String name){        //setter,getter
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getBreed(){
		return breed;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

	public Dog(String name, int age){    //�̸�, ���� �ʱ�ȭ
		this.name = name;
		this.age = age;
	}

	public Dog(String name, String breed, int age){   //�̸�,����,���� �ʱ�ȭ
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String toString(){                    //toString
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
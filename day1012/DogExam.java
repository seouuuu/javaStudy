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
		return "이름: "+name +", 종류 : "+breed +", 나이: "+age; 
	}
}


class DogExam
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("구름",3);
		System.out.println(d1);
		Dog d2 = new Dog("또리","푸들",5);
		System.out.println(d2);
	}
}

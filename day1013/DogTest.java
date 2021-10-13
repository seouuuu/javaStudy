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
		return "강아지이름: " +name+", 강아지종류: "+breed+", 나이: "+age;
	}

}



class DogTest 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("뭉치",2);
		Dog d2 = new Dog("해피","푸들",3);
		System.out.println(d1);
		System.out.println(d2);

	}
}

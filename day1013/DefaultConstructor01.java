class Dog
{
	private String name;
	private int age;
	public String breed;
	
	public String toString(){
		return "강아지이름: " +name+", 강아지종류: "+breed+", 나이: "+age;
	}
}
class DefaultConstructor01 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		System.out.println(d1);
	}
}

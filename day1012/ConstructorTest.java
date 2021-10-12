class Person
{
	private String name;
	private int age;
	public Person(){
		name = "김유신";
		age = 20;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
class ConstructorTest 
{
	public static void main(String[] args) 
	{
		Person kim = new Person();
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		kim.setName("강감찬");
		kim.setAge(21);
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
	}
}

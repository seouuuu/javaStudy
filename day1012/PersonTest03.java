class Person
{
	private String name;
	public void setName(String name){   
		name = name;                                //매개변수에 저장된 것을 매개변수에 저장. 멤버에는 저장x
	}
	public String getName(){
		return name;
	}
}
class PersonTest03 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("홍길동");
		System.out.println(p1.getName());
	}
}

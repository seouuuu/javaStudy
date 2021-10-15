class A
{
	public A(){
		System.out.println("A의 생성자 동작함");
	}
}

class B extends A
{
	public B(){
		super(); //생략가능. 부모클래스의 기본생성자 요구
		System.out.println("B의 생성자 동작함");
	}
}

class InheritanceTestConstructor
{
	public static void main(String[] args) 
	{
		B ob = new B();
	}
}

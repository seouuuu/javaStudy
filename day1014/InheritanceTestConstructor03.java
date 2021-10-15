class A
{
	public A(int i){
		System.out.println("A의 매개변수를 가지는 생성자 동작함");
	}
	public A(){
		System.out.println("A의 기본생성자 동작함");
	}
}

class B extends A
{
	public B(){
		super(); 
		System.out.println("B의 생성자 동작함");
	}
}

class InheritanceTestConstructor03
{
	public static void main(String[] args) 
	{
		B ob = new B();
	}
}

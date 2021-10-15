class A
{
	public A(int i){
		System.out.println("A의 생성자 동작함");
	}
}

class B extends A
{
	public B(){
		super(); 
		System.out.println("B의 생성자 동작함");
	}
}

class InheritanceTestConstructor02
{
	public static void main(String[] args) 
	{
		B ob = new B();
	}
}

class A
{
	public A(int i){
		System.out.println("A�� �Ű������� ������ ������ ������");
	}
	public A(){
		System.out.println("A�� �⺻������ ������");
	}
}

class B extends A
{
	public B(){
		super(); 
		System.out.println("B�� ������ ������");
	}
}

class InheritanceTestConstructor03
{
	public static void main(String[] args) 
	{
		B ob = new B();
	}
}

class A
{
	public A(int i){
		System.out.println("A�� �Ű������� ������ ������ ������");
	}
	
}

class B extends A
{
	public B(){
		super(10);
		System.out.println("B�� ������ ������");
	}
}

class InheritanceTestConstructor04
{
	public static void main(String[] args) 
	{
		B ob = new B();
	}
}

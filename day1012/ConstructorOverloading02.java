class Emp
{
	private String name;
	private int sal;
	private String addr;
	public String toString(){
		return "이름:" + name + ", 급여: "+ sal + ", 주소: " + addr;
	}
	public Emp(){
		name = "홍길동";
		sal = 500;
		addr = "서울";
	}
	public Emp(String name){
		this.name = name;
		sal = 500;
		addr = "서울";
	}
	public Emp(String name, int sal, String addr){
		this.name = name;
		this.sal = sal;
		this.addr = addr;
	}
	public Emp(String name,int sal){
		this.name = name;
		this.sal = sal;
		addr = "서울";
	}
	public Emp(int sal, String name){
		this.sal = sal;
		this.name = name;
		addr = "서울";
	}
	/*
	public Emp(int sal, String addr){           //불가능
		this.sal = sal;
		this.addr = addr;
		name = "홍길동";
	}*/
	public Emp(String name, String addr){   //가능
		this.name = name;
		this.addr = addr;
		sal = 500;
	}
	
}
class ConstructorOverloading02
{
	public static void main(String[] args) 
	{
		Emp a = new Emp();
		System.out.println(a);
		Emp b = new Emp("김유신",600,"광주");
		System.out.println(b);
		Emp c = new Emp(400,"강감찬");
		System.out.println(c);
		Emp d = new Emp("유관순",550);
		System.out.println(d);
		Emp e = new Emp("이황");
		System.out.println(e);
	}
}

class Family
{
	public String name;
	private int age;
	private String role;
	public static String addr;                

	public Family(String name, int age, String role){
		this.name = name;
		this.age = age;
		this.role = role;
	}
	public Family(){
	}
	public String toString(){
		return "name: "+name+", age: "+age+", role: "+role+", addr: "+addr;
	}
	public static void pro(){
		System.out.println("주소: "+ addr);
	}
}

class  StaticTest02
{
	public static void main(String[] args) 
	{
		Family.addr = "서울시 마포구 서교동 1234";
        System.out.println("주소: "+Family.addr);

		Family.pro();
		//Family.toString();   //오류
		
	}
}

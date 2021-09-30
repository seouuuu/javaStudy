class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		char firstName;
		firstName = '홍' ;
		System.out.println(firstName);

		String name;
		name = "홍길동";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "동";
		System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		System.out.println("맨마지막에 있는 문자는 " + last + "입니다.");


/*
C:\javaStudy\day0928>javac CharAndStringTest.java
CharAndStringTest.java:14: error: incompatible types: String cannot be converted to char
                lastName = "동";
                           ^
1 error
*/
	}
}

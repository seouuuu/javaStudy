class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		char firstName;
		firstName = 'ȫ' ;
		System.out.println(firstName);

		String name;
		name = "ȫ�浿";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "��";
		System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		System.out.println("�Ǹ������� �ִ� ���ڴ� " + last + "�Դϴ�.");


/*
C:\javaStudy\day0928>javac CharAndStringTest.java
CharAndStringTest.java:14: error: incompatible types: String cannot be converted to char
                lastName = "��";
                           ^
1 error
*/
	}
}

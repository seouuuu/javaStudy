class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27;
		System.out.println("홍길동의 나이:" + age + "살 입니다.");

		//double height;
		float height;
		//height = 173.8;
		//height = 173.8f;
		height = (float)173.8;
		System.out.println("홍길동의 키:" + height + "입니다." );

		char gender;
		gender = 'M';
		//gender = "M";
		System.out.println("홍길동의 성별은:" + gender);

		boolean isVaccine;
		isVaccine = true;
		System.out.println("홍길동의 1차백신 접종여부:" + isVaccine);

	}
}
/*
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:14: error: incompatible types: possible lossy conversion from double to float
                height = 173.8;
                         ^
1 error
*/

/*
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:21: error: incompatible types: String cannot be converted to char
                gender = "M";
                         ^
1 error
*/
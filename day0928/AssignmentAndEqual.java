class AssignmentAndEqual 
{
	public static void main(String[] args) 
	{
		int age;
		boolean flag;
		//age에 20이라는 값 대입
		//20 = age 틀림. 왼쪽에 변수가 와야 함
		age =20;

		//age의 값이 20과 같은지 비교하여 논리값을 flag에 대입
		flag = age == 20;

		System.out.println(age);
		System.out.println(flag);
	}
}

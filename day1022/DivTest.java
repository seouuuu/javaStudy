//프로그램 실행시 두개의 정수를 전달받아 나누기한 결과 출력 프로그램

class DivTest
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a/b;
		System.out.println("결과:"+result);
	}
}

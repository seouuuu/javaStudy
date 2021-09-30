import java.util.Scanner;
class  Odd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		System.out.print("임의의 수  N을 입력하세요 ==>");
		N = sc.nextInt();
		System.out.println((N%2==0)?"짝수":"홀수");
	}
}

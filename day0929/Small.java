import java.util.Scanner;
class  Small
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("첫번째 정수를 입력하세요==>");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요==>");
		b = sc.nextInt();
		System.out.println( (a<b)?a:b );
	}
}

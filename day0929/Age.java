import java.util.Scanner;
class Age
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("첫번째 사람의 나이를 입력하세요==>");
		a = sc.nextInt();
		System.out.print("두번째 사람의 나이를 입력하세요==>");
		b = sc.nextInt();
		if( a == b )
			System.out.println("두 사람의 나이는 동일합니다.");
		else
			System.out.println("두 사람의 나이는 동일하지 않습니다.");
	}
}


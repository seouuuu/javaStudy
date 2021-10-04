import java.util.Scanner;
class ThreeN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("첫번째 수를 입력하세요==>");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하세요==>");
		b = sc.nextInt();
		System.out.print("세번째 수를 입력하세요==>");
		c = sc.nextInt();
		if ( a>=b && a>=c)
		{
			System.out.println("가장 큰 수는 "+a+ " 입니다."  );
		}
		else if (b>=a && b>=c)
		{
			System.out.println("가장 큰 수는 "+b+ " 입니다."  );
		}
		else if (c>=a && c>=b)
		{
			System.out.println("가장 큰 수는 "+c+ " 입니다."  );
		}
	}
}

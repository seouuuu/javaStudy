import java.util.Scanner;
class BitLogical 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		System.out.print("첫번째 사람의 나이를 입력하세요==>");
		age1 = sc.nextInt();
		System.out.print("두번째 사람의 나이를 입력하세요==>");
		age2 = sc.nextInt();
		if( age1>=20   &  age2>=20 )
			System.out.println("두 사람 모두 스무살 이상입니다.");
		else
			System.out.println("두 사람 모두 스무살 이상은 아닙니다.");
	}
}

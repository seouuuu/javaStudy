import java.util.Scanner;
class BitLogical02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		System.out.print("첫번째 사람의 나이를 입력하세요==>");
		age1 = sc.nextInt();
		System.out.print("두번째 사람의 나이를 입력하세요==>");
		age2 = sc.nextInt();
		//if( ++age1>=20   &  ++age2>=20 )
		if( ++age1>=20   &&  ++age2>=20 )
			System.out.println("두 사람의 나이를 1씩 증가하면 두 사람 모두 스무살 이상입니다.");
		else
			System.out.println("두 사람의 나이를 1씩 증가하면 두 사람 모두 스무살 이상은 아닙니다.");
        System.out.println("age1:" + age1);
		System.out.println("age2:" + age2);
	}
}

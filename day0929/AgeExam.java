import java.util.Scanner;
class  AgeExam
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		System.out.print("첫번째 사람의 나이를 입력하세요==>");
		age1= sc.nextInt();
		System.out.print("두번째 사람의 나이를 입력하세요==>");
		age2= sc.nextInt();
		if(  age1>=20 & age2>=20  )
			System.out.println("두 사람은 모두 20세 이상입니다.");
	}
}

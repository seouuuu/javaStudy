import java.util.Scanner;
class  Scho
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,avg;
		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		System.out.print("국어점수를 입력하세요==>");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요==>");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요==>");
		math = sc.nextInt();
		avg=( kor + eng + math)/3;
		if (  kor>=90 && avg>=90   )
			System.out.println(name + "님은 장학금 지급 대상자입니다.");
		else
			System.out.println(name + "님은 장학금 지급 대상자가 아닙니다.");
	}
}

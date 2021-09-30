import java.util.Scanner;
class ScholarShipTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.print("학생의 이름을 입력하시오==>");
		name = sc.next();
		System.out.print("국어 점수를 입력하시오==>");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오==>");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오==>");
		math = sc.nextInt();
		tot = kor + eng + math;
		avg = (double)tot / 3;
		System.out.println("** 결과 출력**");
		System.out.println("이름:" + name);
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);
		System.out.println("총점:" + tot);
		System.out.println("평균:" + avg);

		if(  kor>=90 && avg>=90  )
			System.out.println("장학금 지급 대상자입니다.");
		else
			System.out.println("장학금 지급 대상자가 아닙니다.");
	}
}

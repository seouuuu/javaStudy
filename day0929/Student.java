//연습) 학생의 이름,국어,영어,수학 점수를 입력받아 총점, 평균(실수값) 출력
//평균이 60점 이상이면 "합격" 그렇지 않으면 "불합격" 출력 
import java.util.Scanner;
class  Student
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요==>");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요==>");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요==>");
		math = sc.nextInt();
		tot = kor + eng + math;
		System.out.println("총점은 " +tot+" 입니다.");
		avg = (double)tot / 3 ;
		System.out.println("평균은 " +avg+" 입니다.");
		if ( avg >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}

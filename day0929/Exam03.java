import java.util.Scanner;
class  Exam03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double n,gram;
		System.out.print("몸무게를 파운드로 입력하세요.==>");
		n = sc.nextDouble();
		gram = n * 454;
		System.out.println("몸무게는 " +gram + "그램 입니다.");
	}
}

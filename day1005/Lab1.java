import java.util.Scanner;
class Lab1 
{
	public static void main(String[] args) 
	{
		int score;
		Scanner input = new Scanner(System.in);
		System.out.printf("성적을 입력하시오:");
		score = input.nextInt();
		if (score >= 60)
			System.out.println("합격!");
		else
			System.out.println("불합격!");
	}
}

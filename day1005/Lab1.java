import java.util.Scanner;
class Lab1 
{
	public static void main(String[] args) 
	{
		int score;
		Scanner input = new Scanner(System.in);
		System.out.printf("������ �Է��Ͻÿ�:");
		score = input.nextInt();
		if (score >= 60)
			System.out.println("�հ�!");
		else
			System.out.println("���հ�!");
	}
}

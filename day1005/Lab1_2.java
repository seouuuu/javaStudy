import java.util.Scanner;
class Lab1_2 
{
	public static void main(String[] args) 
	{
		int score;
		Scanner input = new Scanner(System.in);
		System.out.printf("������ �Է��Ͻÿ�:");
		score = input.nextInt();
		if (score >= 60){
			System.out.println("�հ�!");
			System.out.println("�����մϴ�.");
		}
		else
			System.out.println("���հ�!");
	}
}

import java.util.Scanner;
class Lab1_3 
{
	public static void main(String[] args) 
	{
		int score;
		Scanner input = new Scanner(System.in);
		System.out.printf("������ �Է��Ͻÿ�:");
		score = input.nextInt();
		if (score >= 50 && score<60){
			System.out.println("��Ÿ���� ���հ��Դϴ�.");
		} else if (score>=60 && score<70){
			System.out.println("�հ��Դϴ�.");
		} else if (score>=70 && score<80){
			System.out.println("����ϰ� �հ��Ͽ����ϴ�.");
		} else if (score>=80){
			System.out.println("���� ����ϰ� �հ��Ͽ����ϴ�..");
		} else if (score<50)
			System.out.println("���հ��Դϴ�.");
	}
}

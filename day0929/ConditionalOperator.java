import java.util.Scanner;
class  ConditionalOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,min;
		System.out.print("ù��° ���� �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���==>");
		b = sc.nextInt();
		min = (a<b)?a:b;
		System.out.println("���� ���� "+ min + "�Դϴ�.");
	}
}

import java.util.Scanner;
class Program6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double weight,height,standard;
		System.out.print("�����Ը� �Է��ϼ���==>");
		weight = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���==>");
		height = sc.nextInt();
		standard = (height-100) * 0.9;
		if (standard == weight)
		{
			System.out.println("ǥ��ü���Դϴ�.");
		}
		else if (standard >= weight)
		{
			System.out.println("��ü���Դϴ�.");
		}
		else if (standard <= weight)
		{
			System.out.println("��ü���Դϴ�.");
		}
	}
}

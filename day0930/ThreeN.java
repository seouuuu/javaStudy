import java.util.Scanner;
class ThreeN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("ù��° ���� �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���==>");
		b = sc.nextInt();
		System.out.print("����° ���� �Է��ϼ���==>");
		c = sc.nextInt();
		if ( a>=b && a>=c)
		{
			System.out.println("���� ū ���� "+a+ " �Դϴ�."  );
		}
		else if (b>=a && b>=c)
		{
			System.out.println("���� ū ���� "+b+ " �Դϴ�."  );
		}
		else if (c>=a && c>=b)
		{
			System.out.println("���� ū ���� "+c+ " �Դϴ�."  );
		}
	}
}

import java.util.Scanner;
class MinTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("ù��° ���� �Է��Ͻÿ�==>");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ�==>");
		b = sc.nextInt();
		if(  a<b  )
			System.out.println("���� ���� " +a+"�Դϴ�.");
		else
			System.out.println("���� ���� " +b+"�Դϴ�.");
	}
}

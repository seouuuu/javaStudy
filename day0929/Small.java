import java.util.Scanner;
class  Small
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("ù��° ������ �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���==>");
		b = sc.nextInt();
		System.out.println( (a<b)?a:b );
	}
}

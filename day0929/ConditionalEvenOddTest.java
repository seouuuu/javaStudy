import java.util.Scanner;
class ConditionalEvenOddTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("������  N�� �Է��Ͻÿ�==>");
		n = sc.nextInt();
		//System.out.println(n + "��" + ( (n%2==0)?"¦��":"Ȧ��"   )  + "�Դϴ�.");
		String result = (n%2==0)?"¦��":"Ȧ��";
		System.out.println(n+"�� " +result + "�Դϴ�.");
	}
}

import java.util.Scanner;
class  Odd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		System.out.print("������ ��  N�� �Է��ϼ��� ==>");
		N = sc.nextInt();
		System.out.println((N%2==0)?"¦��":"Ȧ��");
	}
}

import java.util.Scanner;
class  Multi6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean data;
		System.out.println("������ �� N�� �Է��ϼ���");
		n= sc.nextInt();
		data = n%6 ==0;
		System.out.println(data);
	}
}

import java.util.Scanner;
class Sum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("N�� �Է��ϼ���==>");
		n= sc.nextInt();
		int sum=0;
		int i=1;
		do{
			sum+=i;
			i++;
		}
		while (i<=n);
		System.out.printf("1���� %d������ ������ %d�Դϴ�.",n,sum);
	}
}

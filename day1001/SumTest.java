import java.util.Scanner;
class SumTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.print("1���� � ������ ���ϱ� �ұ��?");
		n = sc.nextInt();
		for ( int i=1  ;  i<=n  ;  i++   ){
			sum = sum +i;
		}
		System.out.println("1���� "+n+"������ ���� "+sum+" �Դϴ�.");
	}
}

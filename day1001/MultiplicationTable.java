import java.util.Scanner;
class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("������ �߿� �� ���� ����ұ��? ");
		n = sc.nextInt();
		for( int i =1  ;  i<=9  ;  i++   ){
			System.out.println(n + "*" + i + "=" + (n*i));
		}
	}
}

import java.util.Scanner;
class Add 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,m,sum=0;
		System.out.print("1���� � ������ ���ϱ� �ұ��? ");
		n = sc.nextInt();
		for( m=1  ; m<=n  ;  m++ ){
			sum += m;
		}
		System.out.println("1���� "+ n +"������ ���� "+ sum+" �Դϴ�.");
	}
}
import java.util.Scanner;
class PrimeNumberTest04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.print("N�� �Է��ϼ���==>");
		n=sc.nextInt();
		for (i=2; i<n ;i++ ){
			if ( n%i ==0){
				break;
			}
		}
		if (i==n){
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
	}
}
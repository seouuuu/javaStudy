import java.util.Scanner;
class NumTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.print("N�� �Է����ּ���==>");
		n = sc.nextInt();
		for ( int i=1  ; i<=n  ;i++   ){
			if (n%i==0){
				sum = sum + 1;
			}
		}
		if (sum ==2){
			System.out.println(n+"�� �Ҽ� �Դϴ�.");
			}
		else
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
	}
}

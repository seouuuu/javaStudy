import java.util.Scanner;
class PrimeNumberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,cnt=0;
		System.out.print("N�� �Է��ϼ���==>");
		n=sc.nextInt();
		for ( int i=1 ; i<=n  ; i++  ){
			if ( n%i ==0){
				cnt++;
			}
		}
		if ( cnt ==2){
			System.out.println(n + "�� �Ҽ��Դϴ�.");
		}else{
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
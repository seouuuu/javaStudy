import java.util.Scanner;
class PrimeNumberTest04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.print("N을 입력하세요==>");
		n=sc.nextInt();
		for (i=2; i<n ;i++ ){
			if ( n%i ==0){
				break;
			}
		}
		if (i==n){
			System.out.println(n+"은 소수입니다.");
		}else
			System.out.println(n+"은 소수가 아닙니다.");
	}
}
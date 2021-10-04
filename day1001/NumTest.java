import java.util.Scanner;
class NumTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.print("N을 입력해주세요==>");
		n = sc.nextInt();
		for ( int i=1  ; i<=n  ;i++   ){
			if (n%i==0){
				sum = sum + 1;
			}
		}
		if (sum ==2){
			System.out.println(n+"은 소수 입니다.");
			}
		else
			System.out.println(n+"은 소수가 아닙니다.");
	}
}

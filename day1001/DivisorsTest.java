import java.util.Scanner;
class DivisorsTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();
		System.out.print(n+"의 약수는 ");
		for (int i=1;i<=n ;i++ ){
			if (n%i==0){
				System.out.print(i+ " ");
			}
		}
		System.out.println(" 입니다.");
	}
}

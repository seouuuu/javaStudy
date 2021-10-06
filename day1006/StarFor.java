import java.util.Scanner;
class StarFor
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();
		for (int i=1;i<=n ;i++ ){
			for ( int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


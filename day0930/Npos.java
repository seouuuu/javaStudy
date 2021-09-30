import java.util.Scanner;
class  Npos
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("임의의 수  N을 입력하세요==>");
		n = sc.nextInt();
		if( n>0 ){
			System.out.println(n+100);
		}
		else{
			System.out.println(Math.pow(n,2));
		}
		System.out.println("작업종료");
	}
}

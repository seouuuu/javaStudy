import java.util.Scanner;
class Add 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,m,sum=0;
		System.out.print("1부터 어떤 수까지 더하기 할까요? ");
		n = sc.nextInt();
		for( m=1  ; m<=n  ;  m++ ){
			sum += m;
		}
		System.out.println("1부터 "+ n +"까지의 합은 "+ sum+" 입니다.");
	}
}

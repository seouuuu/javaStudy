import java.util.Scanner;
class Remain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N,i;
		System.out.print("N을 입력하세요==>");
		N = sc.nextInt();
		for ( i=1  ; i<=N  ; i++   ){
			if (N%i==0){
				System.out.println(i);
			}
		}
	}
}

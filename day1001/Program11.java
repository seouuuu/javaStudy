import java.util.Scanner;
class Program11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0보다 큰 정수를 입력하세요==>");
		n = sc.nextInt();
		if ( n <=0){
			System.out.println("잘못 입력하였습니다.");
		} else {
			for ( int i=1 ;i<n ; i++ ){
				if ( i %3==0 ){
					System.out.print(i +" ");
				}
			}
		}
	}
}

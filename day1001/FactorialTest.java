import java.util.Scanner;
class FactorialTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum =1;
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();
		for (  int i=n ; i >=1     ; i--   ){
			sum = sum *i;
			System.out.print(i);
			if (i !=1){
				System.out.print("*");
			}
		}
		System.out.println("=" + sum);
	}
}

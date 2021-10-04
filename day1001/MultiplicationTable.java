import java.util.Scanner;
class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("구구단 중에 몇 단을 출력할까요? ");
		n = sc.nextInt();
		for( int i =1  ;  i<=9  ;  i++   ){
			System.out.println(n + "*" + i + "=" + (n*i));
		}
	}
}

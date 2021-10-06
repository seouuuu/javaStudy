import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int mul=1;
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();
		while (n>1){
			System.out.printf("%d*",n);
			mul *= n;
			n--;
		}
		System.out.printf("1=%d",mul);
	}
}

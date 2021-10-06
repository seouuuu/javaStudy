import java.util.Scanner;
class Sum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("N을 입력하세요==>");
		n= sc.nextInt();
		int sum=0;
		int i=1;
		do{
			sum+=i;
			i++;
		}
		while (i<=n);
		System.out.printf("1부터 %d까지의 총합은 %d입니다.",n,sum);
	}
}

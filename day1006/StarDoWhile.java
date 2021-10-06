import java.util.Scanner;
class StarDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();
		int i=1;
		do{
			int j=1;
			do{
				System.out.print("*");
				j++;
			}
			while (j<=i);
			System.out.println();
			i++;
		}
		while (i<=n);
		}
	}

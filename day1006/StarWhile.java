import java.util.Scanner;
class StarWhile
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();
		int i=1;
		while (i<=n){
			int j=1;
			while (j<=i){
				System.out.print("*");
				j++;
			}
		    System.out.println();
			i++;
		}
	}
}

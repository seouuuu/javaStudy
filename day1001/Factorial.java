import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,N,mul=1,result;
		System.out.print("N을 입력하세요");
		N=sc.nextInt();
		for ( i=1  ; i<=N  ;  i++ )
		{
			mul *= i;
		}
		for ( result=N ; result>1  ; result-- )
			{
				System.out.print(result+"*");
			}
			System.out.print("1 = "+mul);
			}
	}


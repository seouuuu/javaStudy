import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N,i,odd=0,even=0,odd1=0,even1=0;
		System.out.print("N을 입력하세요==>");
		N= sc.nextInt();
		for ( i=1  ;  i<=N ;  i++  )
		{
			if (i%2==0){
				even +=i;
			}
			else if (i%2==1){
				odd +=i;
			}
		}
		System.out.println("홀수의 합은 "+ odd +" 입니다.");
		System.out.println("짝수의 합은 "+ even +" 입니다.");
		if (N%2==0){
			even1 = N/2;
				odd1 =N/2;
		}
		else if (N%2==1){
			even1=N/2;
				odd1=N/2 + 1;
		}
			System.out.println("짝수의 개수는"+even1+"개 입니다.");
			System.out.println("홀수의 개수는"+odd1+"개 입니다.");
	}
}

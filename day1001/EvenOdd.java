import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N,i,odd=0,even=0,odd1=0,even1=0;
		System.out.print("N�� �Է��ϼ���==>");
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
		System.out.println("Ȧ���� ���� "+ odd +" �Դϴ�.");
		System.out.println("¦���� ���� "+ even +" �Դϴ�.");
		if (N%2==0){
			even1 = N/2;
				odd1 =N/2;
		}
		else if (N%2==1){
			even1=N/2;
				odd1=N/2 + 1;
		}
			System.out.println("¦���� ������"+even1+"�� �Դϴ�.");
			System.out.println("Ȧ���� ������"+odd1+"�� �Դϴ�.");
	}
}
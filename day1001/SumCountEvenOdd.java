import java.util.Scanner;
class  SumCountEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,even_sum=0,odd_sum=0,even_cnt=0,odd_cnt=0;
		System.out.print("N�� �Է��ϼ���==>");
		n = sc.nextInt();
		for (int i=1 ; i<=n;  i++ ){
			if (i%2==0){
				even_sum +=i;  //even_sum = even_sum + i;
				even_cnt++;   //even_cnt = even_cnt +1;
			}
			else{
				odd_sum+=i;
				odd_cnt++;
			}
		}
		System.out.println("1����"+n+"������ ¦���� ��: "+ even_sum);
		System.out.println("1����"+n+"������ ¦���� ����: "+ even_cnt);
		System.out.println("1����"+n+"������ Ȧ���� ��: "+ odd_sum);
		System.out.println("1����"+n+"������ Ȧ���� ����: "+ odd_cnt);
	}
}

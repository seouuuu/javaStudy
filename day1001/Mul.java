import java.util.Scanner;
class  Mul
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,n,m;
		System.out.print("������ �� �� ���� ����ұ��? ");
		num = sc.nextInt();
		for( n=1;  n <=9   ;  n++     ){
			m = num * n;
			System.out.println(num +" * "+n+" = "+m);
		}
	}
}

import java.util.Scanner;
class Program3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		double price;
		System.out.print("������ ������ �Է��ϼ���==>");
		num = sc.nextInt();
		if ( num >= 10){
			price = (100.0*num)*0.9;
		} else
		price = 100.0*num;
		System.out.println("���԰��� : "+ price + "��");
	}
}

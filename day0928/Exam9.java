import java.util.Scanner;
class Exam9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int data,a,b,c,d;
		System.out.print("������ �Է��Ͻÿ�:");
		data = sc.nextInt();
		a = data /1000;
		b = (data - a*1000) /100;
		c = (data - a*1000-b*100)/10;
		d = data - a*1000-b*100-c*10;
		System.out.println("õ�� �ڸ�:" + a);
		System.out.println("���� �ڸ�:" + b);
		System.out.println("���� �ڸ�:" + c);
		System.out.println("���� �ڸ�:" + d);
	}
}
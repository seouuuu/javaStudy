import java.util.Scanner;
class Program7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min=0;
		System.out.print("ù��° ������ �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ���==>");
		b = sc.nextInt();
		System.out.print("����° ������ �Է��ϼ���==>");
		c = sc.nextInt();
		if (a<=b && a<=c){
			min =a;
		} else if(b<=c && b<=a){
			min =b;
		}else if(c<=b && c<=a){
			min =c;
		}
		System.out.println("���� ���� ���� "+min+"�Դϴ�.");
	}
}

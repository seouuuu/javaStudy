import java.util.Scanner;
class  Programming03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price = 100;
		int cnt,total;
		System.out.print("������ ���ż����� �Է��ϼ���==>");
		cnt = sc.nextInt(0);
		total = price * cnt;
		if (cnt>=10){
			total = (int)(total * 0.9);
		}
		System.out.println("��ü������ "+total +"�Դϴ�.");
	}
}

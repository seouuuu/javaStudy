import java.util.Scanner;
class PaymentTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String item;
		int price,qty,total;
		System.out.print("��ǰ���� �Է��Ͻÿ�==>");
		item = sc.next();
		System.out.print("��ǰ�� �ܰ��� �Է��Ͻÿ�==>");
		price = sc.nextInt();
		System.out.print("���ż����� �Է��Ͻÿ�==>");
		qty = sc.nextInt();
		total = price *qty;

		System.out.println("** ��� ��� **");
		System.out.println("��ǰ��:" + item);
		System.out.println("�ܰ�:" + price);
		System.out.println("����:" + qty);
		System.out.println("�ѱݾ�:" + total);

		if(qty>=10 || total >=20000)
			System.out.println("���� �ݾ��� 10% �����Ͽ�"+(total*0.9)+"�� �Դϴ�.");
		else
			System.out.println("���� �ݾ���"+total+"�� �Դϴ�.");
	}
}

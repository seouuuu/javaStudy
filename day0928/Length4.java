//����) ��������� ���ڿ��� �Է¹޾� ���ڿ��� ���̰� 4���� �̻��̸� true
//�ƴϸ� false�� ���

import java.util.Scanner;
class Length4 
{
	public static void main(String[] args) 
	{ Scanner sc = new Scanner(System.in);
	String  data;
	System.out.println("���ڿ��� �Է��ϼ���");
	data = sc.next();
	boolean flag;
	flag = data.length()>=4;
	System.out.println(flag);
	}
}

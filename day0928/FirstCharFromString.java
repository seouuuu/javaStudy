//����) ��������� ���ڿ��� �Է¹޾� ù��° ���ڸ� ���

import java.util.Scanner;
class  FirstCharFromString
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String data;
	System.out.println("���ڿ��� �Է��ϼ���");
	data = sc.next();
	//char first;
	//first = data.charAt(0);
	//System.out.println("ù��° ���ڴ�" + first);

	//String first = data.charAt(0)+""; // String���� ����� ���� + ""
	String first = data.substring(0,1);
	System.out.println("ù��° ���ڴ�" + first);
	}
}

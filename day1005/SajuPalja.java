import java.util.Scanner;
class SajuPalja 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []result = {"õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��",};
		String name;
		int year;
		int month;
		int date;
		int time;
		System.out.print("�̸��� �Է��Ͻÿ�==>");
		name = sc.next();
		System.out.println("�츦 �Է��ϼ���");
		System.out.print("0:��,1:��,2:��,3:�䳢,4:��,5:��,6:��,7:��,8:������,9:��,10:��,11:���� ==>");
		year = sc.nextInt();
		System.out.print("������ �Է��ϼ���==>");
		month = sc.nextInt();
		System.out.print("������ �Է��ϼ���==>");
		date = sc.nextInt();
		System.out.println("���ø� �Է��ϼ���");
		System.out.print("0:��,1:��,2:��,3:��,4:��,5:��,6:��,7:��,8:��,9:��,10:��,11:��==>");
		time = sc.nextInt();
		int n =year;
		System.out.println("**"+name + "���� �������� Ǯ��**");
		System.out.println("������ ���: "+ result[n]);
		n = (n + month-1)%12;
		System.out.println("������ ���: "+ result[n]);
		n = (n + date -1)%12;
		System.out.println("������ ���: "+ result[n]);
		n = (n + time)%12;
		System.out.println("������ ���: "+ result[n]);
	}
}

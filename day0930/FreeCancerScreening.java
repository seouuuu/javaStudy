import java.util.Scanner;
import java.util.Date;
class FreeCancerScreening 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name,items;
		int userYear,age,thisYear;
		thisYear = today.getYear() + 1900;

		System.out.print("�̸��� �Է��Ͻÿ�==>");
		name = sc.next();
		System.out.print("��������� �Է��Ͻÿ�==>");
		userYear = sc.nextInt();

		age = thisYear - userYear;
		System.out.println(name + "��, ���ؿ�"+age+ "���Դϴ�.");
		if (age >= 40 && thisYear%2 == userYear%2){
			items = "����, ����";
			if (age>=50)
			{
				items = items + ",�����";
			}
			System.out.println(name + "��,"+ thisYear + "�⵵�� ����ϰ��� ������Դϴ�.");
			System.out.println("�ϰ��� �׸��� " +items+ "�Դϴ�.");
		}
		else{
			System.out.println(name + "��, "+ thisYear+"�⵵�� ����ϰ��� ����ڰ� �ƴմϴ�.");
		}

		

	}
}

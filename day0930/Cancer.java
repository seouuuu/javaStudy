import java.util.Scanner;
import java.util.Date;
class  Cancer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		int userYear,age;
		int thisYear = today.getYear()+1900;
		System.out.print("�̸��� �Է��ϼ���==>");
		name = sc.next();
		System.out.print("��������� �Է��ϼ���==>");
		userYear = sc.nextInt();
		age = thisYear - userYear;
		if ( age >= 40 && thisYear%2==userYear%2)
		{if ( age>=40 && age<50)
		{
			System.out.println(name +"���� ����ϰ��� ����� �Դϴ�.�׸��� ����,�����Դϴ�.");
		}
		else if ( age >=50){
			System.out.println(name +"���� ����ϰ��� ����� �Դϴ�.�׸��� ����,����,������Դϴ�.");
		}
		
		}
         else
			System.out.println(name +"���� ����ϰ��� ����ڰ� �ƴմϴ�.");


	}
}
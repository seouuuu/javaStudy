import java.util.Scanner;
class  Scho
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,avg;
		System.out.print("�̸��� �Է��ϼ���==>");
		name = sc.next();
		System.out.print("���������� �Է��ϼ���==>");
		kor = sc.nextInt();
		System.out.print("���������� �Է��ϼ���==>");
		eng = sc.nextInt();
		System.out.print("���������� �Է��ϼ���==>");
		math = sc.nextInt();
		avg=( kor + eng + math)/3;
		if (  kor>=90 && avg>=90   )
			System.out.println(name + "���� ���б� ���� ������Դϴ�.");
		else
			System.out.println(name + "���� ���б� ���� ����ڰ� �ƴմϴ�.");
	}
}

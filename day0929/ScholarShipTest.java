import java.util.Scanner;
class ScholarShipTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.print("�л��� �̸��� �Է��Ͻÿ�==>");
		name = sc.next();
		System.out.print("���� ������ �Է��Ͻÿ�==>");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�==>");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�==>");
		math = sc.nextInt();
		tot = kor + eng + math;
		avg = (double)tot / 3;
		System.out.println("** ��� ���**");
		System.out.println("�̸�:" + name);
		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + math);
		System.out.println("����:" + tot);
		System.out.println("���:" + avg);

		if(  kor>=90 && avg>=90  )
			System.out.println("���б� ���� ������Դϴ�.");
		else
			System.out.println("���б� ���� ����ڰ� �ƴմϴ�.");
	}
}

import java.util.Scanner;
class Programming02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double area=0, width, height, radius;
		char type;
		System.out.print("������ ������ �Է��ϼ���.R:�簢��,T:�ﰢ��,C:�� ==>");
		type = sc.next().charAt(0);
		if (type =='R'){
			System.out.print("�簢���� ���α��̸� �Է��ϼ���==>");
			width = sc.nextDouble();
			System.out.print("�簢���� ���α��̸� �Է��ϼ���==>");
			height = sc.nextDouble();
			area = width * height;
			System.out.print("�簢���� ������");
		}else if (type == 'T'){
			System.out.print("�ﰢ���� �غ��� ���̸� �Է��ϼ���==>");
			width = sc.nextDouble();
			System.out.print("�ﰢ���� ���̸� �Է��ϼ���==>");
			height = sc.nextDouble();
			area = width * height /2;
			System.out.print("�ﰢ���� ������ ");
		}else if (type == 'C'){
			System.out.print("���� �������� ���̸� �Է��ϼ���==>");
			radius = sc.nextDouble();
			area = 3.14*radius*radius;
		    System.out.print("���� ������ ");
		}else{
		    System.out.println("������ ������ �߸� �����Ͽ����ϴ�.");
			return; // ���⼭ main �޼ҵ带 ����
		}
		System.out.println(area + "�Դϴ�.");
	}
}

import java.util.Scanner;
class  Program2 
{ public static void main(String[] args) 
	{  Scanner sc = new Scanner(System.in);
		char data;
		int a,b,c,d,e;
	    System.out.print("R,T,C �� �ϳ��� �Է��ϼ���==>");
		data = sc.next().charAt(0);
		if (data == 'R'){
			System.out.print("�簢���� ���θ� �Է��ϼ���==>");
			a = sc.nextInt();
			System.out.print("�簢���� ���θ� �Է��ϼ���==>");
			b = sc.nextInt();
			System.out.println("�簢���� ������ "+(a*b)+"�Դϴ�.");
		}else if (data == 'T'){
			System.out.print("�ﰢ���� �غ��� �Է��ϼ���==>");
			c = sc.nextInt();
			System.out.print("�ﰢ���� ���̸� �Է��ϼ���==>");
			d = sc.nextInt();
			System.out.println("�ﰢ���� ������ "+((c*d)/2)+"�Դϴ�.");
		}else if (data=='C'){
			System.out.print("���� �������� �Է��ϼ���==>");
			e = sc.nextInt();
			System.out.println("���� ������ "+(e*e)+"���Դϴ�.");
		}
		}
	}

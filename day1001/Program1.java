import java.util.Scanner;
class Program1 
{ public static void main(String[] args) 
	{  Scanner sc = new Scanner(System.in);
		char cal; //�ѱ��� ���� char
		int a,b;
		System.out.print("��Ģ���� +,-,*,/ �� �ϳ��� �Է��ϼ���==>");
		cal = sc.next().charAt(0); //char�Է�
		if (cal == '+' || cal== '-' || cal== '*' ||cal=='/'){
			System.out.print("ù��° ���� �Է��ϼ���");
			a = sc.nextInt();
			System.out.print("�ι�° ���� �Է��ϼ���");
			b = sc.nextInt();
			if (cal == '+'){
				System.out.println(a + b);
			} else if ( cal =='-'){
				System.out.println(a - b);
			} else if ( cal == '*'){
				System.out.println(a * b);
			} else if ( cal =='/'){
				if (b == 0){
					System.out.println("�и� 0 �̱� ������ �������� �� �� �����ϴ�.");
				} else
					System.out.println(a / b);
			} 
		}
		else
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
}

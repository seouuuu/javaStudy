import java.util.Scanner;
class  MaxMin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []name = new String[10];
		int []user = new int[10];
		int max,min;
		for (int i = 0; i<user.length ; i++ )
		{ System.out.print((i+1)+"�� �л��� �̸��� �Է��ϼ���==>");
		  name[i] = sc.next();
		 System.out.print((i+1)+"�� �л��� ������ �Է��ϼ���==>");
		  user[i] =sc.nextInt();
		}
		max = user[0];
		for (int i=1 ; i<user.length ; i++){
			if (max<user[i] ){
				max = user[i];
			}
		}
		min = user[0];
		for (int i=1 ; i<user.length ; i++){
			if (min >user[i] ){
				min = user[i];
			}
		}
		System.out.println("�ִ�: " + max);
		System.out.println("�ּڰ�: " + min);
	}
}

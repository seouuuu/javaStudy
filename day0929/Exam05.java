import java.util.Scanner;
class  Exam05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int time,hour,min,sec;
		System.out.print("�ð��� �ʴ����� �Է��ϼ���==>");
		time = sc.nextInt();
		hour = time / 3600;
		min = (time % 3600) / 60;
		sec = ((time % 3600) % 60);
		System.out.print(time +"�ʴ� " +hour +"�ð� " +min+" �� "+sec+" �� �Դϴ�.");
	}
}
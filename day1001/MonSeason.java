import java.util.Scanner;
class MonSeason 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int mon;
		String season="";
		System.out.print("���� �Է��ϼ���==>");
		mon = sc.nextInt();
		switch(mon){
			case 1: season="�ܿ�";break;
			case 2: season="�ܿ�";break;
			case 3: season="��";break;
			case 4: season="��";break;
			case 5: season="��";break;
			case 6: season="����";break;
			case 7: season="����";break;
			case 8: season="����";break;
			case 9: season="����";break;
			case 10: season="����";break;
			case 11: season="����";break;
			case 12: season="�ܿ�";break;
		}
		System.out.println(mon+"���� "+season+"�Դϴ�.");
	
}
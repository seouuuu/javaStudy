import java.util.Scanner;
class  Monthlast
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int month;
	String name="";
	System.out.print("���� �Է��ϼ���==>");
	month = sc.nextInt();
	 if (month==1 || month ==3 || month==5 || month==7|| month==8||month==10||month==12){
			System.out.println( month +"�� �� 31�� ���� �ֽ��ϴ�. ");
		     }
		     else if ( month == 4 || month == 6|| month == 9|| month == 11)
		      {
			System.out.println( month + "���� 30�� ���� �ֽ��ϴ�.");
		       }
		     else if ( month == 2)
		      {
			System.out.println( month +"���� 28�ϱ��� �ֽ��ϴ�.");
		       }
	}
}

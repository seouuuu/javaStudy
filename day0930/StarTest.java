import java.util.Scanner;
class StarTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,data="";
		int mon,day;
		System.out.print("�̸��� �Է��ϼ���==>");
		name = sc.next();
		System.out.print("���� ���� �Է��ϼ���==>");
		mon = sc.nextInt();
		if (mon<1 || mon>12)
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		else if (mon>=1 && mon<=12)
		{
			System.out.println("���� ���� �Է��ϼ���");
			day = sc.nextInt();
			if (mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
			{ if ( day>31 || day<1)
				{ System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}else
				{switch(mon){
					case 1:if(day>19){data="�����ڸ�";}else{data="�����ڸ�";};break;
					case 3:if(day>20){data="���ڸ�";}else{data="������ڸ�";};break;
					case 5:if(day>20){data="�ֵ����ڸ�";}else{data="Ȳ���ڸ�";};break;
					case 7:if(day>22){data="�����ڸ�";}else{data="���ڸ�";};break;
					case 8:if(day>22){data="ó���ڸ�";}else{data="�����ڸ�";};break;
					case 10:if(day>22){data="�����ڸ�";}else{data="õĪ�ڸ�";};break;
					case 12:if(day>24){data="�����ڸ�";}else{data="����ڸ�";};break;
				}
				System.out.println(name+"���� ���ڸ��� "+data+"�Դϴ�.");}
			}else if (mon==4||mon==6||mon==9||mon==11)
			{if (day>30 || day<1)
			{System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}else
				{switch(mon){
					case 4:if(day>19){data="Ȳ���ڸ�";}else{data="���ڸ�";};break;
					case 6:if(day>21){data="���ڸ�";}else{data="�ֵ����ڸ�";};break;
					case 9:if(day>23){data="õĪ�ڸ�";}else{data="ó���ڸ�";};break;
					case 11:if(day>22){data="����ڸ�";}else{data="�����ڸ�";};break;
				}
				System.out.println(name+"���� ���ڸ��� "+data+"�Դϴ�.");
				}}
				else if (mon==2)
			{if(day>28 ||day<1){
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}else
				{switch(mon){
					case 2:if(day>18){data="������ڸ�";}else{data="�����ڸ�";};break;
						}System.out.println(name+"���� ���ڸ��� "+data+"�Դϴ�.");}
			}
		}
	}
}

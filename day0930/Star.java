//�̸� ���� ���� �Է¹޾� ���ڸ� ���
//�̸�==>
//����==>
//����==>
//___���� ���ڸ��� ___�ڸ� �Դϴ�.
//�߸��� �Է°� �����°ű���(2�� 28�ϱ���)
//������ �߸� �Է��ϸ� ���� �Է����� ���ϰ� �����
import java.util.Scanner;
class  Star
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int mon,day;
		System.out.print("�̸��� �Է��ϼ���==>");
		name = sc.next();
		System.out.print("������ �Է��ϼ���==>");
		mon = sc.nextInt();
		
		if(mon>12 || mon<1)
			{System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		else  {
			System.out.print("������ �Է��ϼ���==>");
		    day = sc.nextInt();
				if (mon==1||mon ==3||mon==5||mon==7||mon==8||mon==10||mon==12)
					{if(day>31 || day<1) {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}
					}
				else if(mon==4||mon==6||mon==9||mon==11){
						if (day>30 || day<1)
						{
							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}
				else if (mon==2)
					{if (day>28 || day<1)
					{
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}
					}
						switch(mon){
								case 1: if (day >=20) { System.out.println("�����ڸ�"); } 
											else { System.out.println("�����ڸ�"); } break; 
								case 2: if (day >=19) { System.out.println("�������ڸ�"); } 
											else { System.out.println("�����ڸ�"); } break; 
								case 3: if (day >=21) { System.out.println("���ڸ�"); } 
										else { System.out.println("�������ڸ�"); } break; 
								case 4: if (day >=20) { System.out.println("Ȳ���ڸ�"); } 
										else { System.out.println("���ڸ�"); } break; 
								case 5: if (day >=21) { System.out.println("�ֵ����ڸ�"); } 
										else { System.out.println("Ȳ���ڸ�"); } break; 
								case 6: if (day >=22) { System.out.println("���ڸ�"); } 
										else { System.out.println("�ֵ����ڸ�"); } break; 
								case 7: if (day >=23) { System.out.println("�����ڸ�"); } 
										else { System.out.println("���ڸ�"); } break; 
								case 8: if (day >=23) { System.out.println("ó���ڸ�"); } 
										else { System.out.println("�����ڸ�"); } break; 
								case 9: if (day >=24) { System.out.println("õĪ�ڸ�"); } 
										else { System.out.println("ó���ڸ�"); } break; 
								case 10: if (day >=23) { System.out.println("�����ڸ�"); } 
										else { System.out.println("õĪ�ڸ�"); } break; 
								case 11: if (day >=23) { System.out.println("����ڸ�"); } 
										else { System.out.println("�����ڸ�"); } break; 
								case 12: if (day >=25) { System.out.println("�����ڸ�"); } 
										else { System.out.println("����ڸ�"); } break;
					     }
		}
		}
}
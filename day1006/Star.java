import java.util.Scanner;
class Star
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		
		int mon=0;
		int day=0;//if�� �ȿ� ���� �����ϴ� switch�� �Ҷ� �������� ���� ��ó�� ���ͼ�
		char ans;

		do{
			System.out.print("�̸��� �Է��ϼ���==>");
		    name = sc.next();
			do{
				System.out.print("������ �Է��ϼ���==>");
				mon = sc.nextInt();
			} while (mon<1 || mon>12);
			if(mon==2){
				do{
					System.out.print("������ �Է��ϼ���==>");
					day = sc.nextInt();
				} while (day<1 || day>28);
			} else if (mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12){
				do{
					System.out.print("������ �Է��ϼ���==>");
					day = sc.nextInt();
					} while (day<1 || day>31);
			}else if (mon==4||mon==6||mon==9||mon==11){
			  do{
					System.out.print("������ �Է��ϼ���==>");
					day = sc.nextInt();
				} while (day<1 || day>31);
			}

			String data="";
			switch(mon){
						case 1:if(day>19){data="�����ڸ�";}else{data="�����ڸ�";};break;
						case 2:if(day>18){data="������ڸ�";}else{data="�����ڸ�";};break;
						case 3:if(day>20){data="���ڸ�";}else{data="������ڸ�";};break;
						case 4:if(day>19){data="Ȳ���ڸ�";}else{data="���ڸ�";};break;
						case 5:if(day>20){data="�ֵ����ڸ�";}else{data="Ȳ���ڸ�";};break;
						case 6:if(day>21){data="���ڸ�";}else{data="�ֵ����ڸ�";};break;
						case 7:if(day>22){data="�����ڸ�";}else{data="���ڸ�";};break;
						case 8:if(day>22){data="ó���ڸ�";}else{data="�����ڸ�";};break;
						case 9:if(day>23){data="õĪ�ڸ�";}else{data="ó���ڸ�";};break;
						case 10:if(day>22){data="�����ڸ�";}else{data="õĪ�ڸ�";};break;
						case 11:if(day>22){data="����ڸ�";}else{data="�����ڸ�";};break;
						case 12:if(day>24){data="�����ڸ�";}else{data="����ڸ�";};break;
			}
			System.out.printf("%s���� ���ڸ��� %s�Դϴ�.",name,data);
			System.out.println();

			do{
			System.out.print("���Ͻðھ��?(y/n) ==>");
			ans = sc.next().charAt(0);
			}
			while (ans!='y' && ans!='n');
			
		} while(ans == 'y');
		if (ans=='n'){
			System.out.println("�����Ͽ����ϴ�.");
		}
	}
}

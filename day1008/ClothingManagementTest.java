import java.util.Scanner;
class ClothingManagement //�Ƿ�������
{
	String name;
	String company;
	boolean power;
	String clothes;
	boolean water;
	String mode;
	
	void act(){
		if (power){ //����
			System.out.printf("%s�� %s�� ������ �մϴ�.\n",company,name);
			System.out.printf("%s�� %s��(��) �ֽ��ϴ�.\n",name,clothes);

			if (water){ //������
				System.out.printf("%s�� �������� �ʿ��մϴ�.\n",name);
			} else{
				System.out.printf("%s��带 �����մϴ�.\n",mode);
			}

		} else{
			System.out.printf("%s�� %s�� ������ ���ϴ�.\n",company,name);
		}
	}
}

class  ClothingManagementTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ClothingManagement c = new ClothingManagement();

		System.out.print("�Ƿ��������� �𵨸��� �Է��ϼ���==>");
		c.name = sc.next();
		System.out.printf("%s�� ����ȸ�縦 �Է��ϼ���==>",c.name);
		c.company = sc.next();
		System.out.print("������ ��ǰ�� �Է��ϼ���==>");
		c.clothes=sc.next();

		char user_power=' '; //����
		while(user_power !='y' && user_power !='n'){
			System.out.printf("%s�� ������ �ѽðڽ��ϱ�?(y/n)==>",c.name);
			user_power = sc.next().charAt(0);
			if(user_power=='y'){
				c.power = true;
			} else if(user_power=='n'){
				c.power = false;
			  }
		}
		char user_water=' '; //������
		while(user_water !='y' && user_water!='n'){
			System.out.printf("%s�� �������� �ʿ��մϱ�?(y/n)==>",c.name);
			user_water = sc.next().charAt(0);
			if (user_water=='y'){
				c.water = true;
			} else if(user_water=='n'){
				c.water = false; //�������� �ʿ���� �� �ɾ��� ����
				System.out.print("�ɾ��带 �����ϼ���(ǥ��/�޼�/����/������)==>");
				c.mode = sc.next();
			}
		}
		c.act();
	}
}

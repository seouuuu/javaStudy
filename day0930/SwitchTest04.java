import java.util.Scanner;
class SwitchTest04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0~9 ������ ���� �Է��ϼ���==>");
		n = sc.nextInt();
		if( n <0 || n > 9){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else{
			String result = "";
			switch(n){
				case 0:result = "��";
				case 1:result = "��";
				case 2:result = "��";
				case 3:result = "��";break; 
				case 4:result = "��";
				case 5:result = "��"; 
				case 6:result = "��";
				case 7:result = "ĥ";break;
				case 8:result = "��";
				case 9:result = "��";
			}
			System.out.println(result);
		}

	}
}

import java.util.Scanner;
class SeasonNameSwitch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		String name="";
		System.out.print("���� �Է��Ͻÿ�==>");
		month = sc.nextInt();

		if (month<1 || month>12){
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}else{
				switch(month){
					case 3: case 4: case 5: name = "��"; break;
					case 6: case 7: case 8: name = "����"; break;
					case 9: case 10: case 11: name = "����"; break;
					case 12: case 1: case 2: name = "�ܿ�"; break;
			}
			System.out.println(month +"���� "+name+ "�Դϴ�");
		}
	}
}

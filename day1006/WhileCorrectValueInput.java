import java.util.Scanner;
class WhileCorrectValueInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month=-1;
		do{
			System.out.print("���� �Է��ϼ���==>");
			month = sc.nextInt();
		} while (month<1||month>12);

		/*
		while (month<1||month>12){
			System.out.print("���� �Է��ϼ���==>");
			month = sc.nextInt();
		}
		*.
       
	   
	   
	   /*
	   while (true){
		   System.out.print("���� �Է��ϼ���==>");
			month = sc.nextInt();
			if (month>=1 && month<=12)
			break;
	   }
		*/
		/*
		for (; ; ) {
			System.out.print("���� �Է��ϼ���==>");
			month = sc.nextInt();
			if (month>=1 && month<=12){
			break;
			}
		}
		*/
		String name = "";
		if (month>=3 && month<=5){
			name = "��";
		} else if (month>=6 && month<=8){
			name = "����";
		} else if (month>=9 && month<=11){
			name = "����";}
			else {
			name = "�ܿ�";
		} 
		System.out.printf("%d���� %s�Դϴ�.",month,name);
	}
}


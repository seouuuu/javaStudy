import java.util.Scanner;
class  SeasonNameCheckMonth
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int month;
	String name="";
	System.out.print("���� �Է��ϼ���==>");
	month = sc.nextInt();
	if ( month<1 || month>12 ){
		System.out.println("�߸��� �Է��Դϴ�.");
	}else{
	    if (  month >=3 && month <=5 ){
		name = "��";
	    }else if ( month >=6 && month <= 8){
		name = "����";
     	}else if ( month >=9 && month <= 11){
		name = "����";
	    }else if (month ==1 || month ==2 || month ==12)
	    { name = "�ܿ�";
     	}
	    System.out.println(month +"���� "+name+ "�Դϴ�.");
	}
	}
	}

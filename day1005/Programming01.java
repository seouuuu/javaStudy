import java.util.Scanner;
class  Programming01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char op;
		int a,b;
		System.out.print("�����ڸ� �Է��ϼ���==>");
		op = sc.next().charAt(0);
		System.out.print("ù��° ���� �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.print("ù��° ���� �Է��ϼ���==>");
		b = sc.nextInt();
		if (op == '+'){
			System.out.println(a + "+" + b+"="+ (a+b));
		} else if (op =='-'){
			System.out.println(a + "-" + b+"="+(a-b));
		}else if (op =='*'){
			System.out.println(a + "*" + b+"="+(a*b));
	   }else if (op =='/'){
		   if (b ==0){
			   System.out.println("�и� 0�� �� ���� �����ϴ�.");
		   }else
			System.out.println(a + "/" + b+"="+(a/b));
	   } else{
		System.out.println("�߸��� ������ �Դϴ�.");
	   }
    }
}
import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int row,line;
		System.out.print("ĭ���� �Է��ϼ���==>");
		row = sc.nextInt();
		System.out.print("�ټ��� �Է��ϼ���==>");
		line = sc.nextInt();
		int j=1;
		do{ int i=1;
			do{
			  System.out.print("*");
			  i++;
		   } while (i<=row);
		   j++;
			   System.out.println();
		} while(j<=line); 
	}
}

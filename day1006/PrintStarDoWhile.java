import java.util.Scanner;
class PrintStarDoWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int row,col;
		System.out.print("�ټ��� �Է��ϼ���==>");
		row = sc.nextInt();
		System.out.print("ĭ���� �Է��ϼ���==>");
		col = sc.nextInt();
		int i,j;
		i=1;
		do{
			j=1;
			do{
				System.out.print("*");
				j++;
			} while (j<=col);
			System.out.println();
			i++;
		} while (i<=row );
	}
}

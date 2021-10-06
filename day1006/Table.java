import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int row,line;
		System.out.print("칸수를 입력하세요==>");
		row = sc.nextInt();
		System.out.print("줄수를 입력하세요==>");
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

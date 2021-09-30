import java.util.Scanner;
class  Multi6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean data;
		System.out.println("임의의 수 N을 입력하세요");
		n= sc.nextInt();
		data = n%6 ==0;
		System.out.println(data);
	}
}

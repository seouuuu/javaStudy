import java.util.Scanner;
class Program6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double weight,height,standard;
		System.out.print("몸무게를 입력하세요==>");
		weight = sc.nextInt();
		System.out.print("키를 입력하세요==>");
		height = sc.nextInt();
		standard = (height-100) * 0.9;
		if (standard == weight)
		{
			System.out.println("표준체중입니다.");
		}
		else if (standard >= weight)
		{
			System.out.println("저체중입니다.");
		}
		else if (standard <= weight)
		{
			System.out.println("과체중입니다.");
		}
	}
}

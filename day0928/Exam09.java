import java.util.Scanner;
class  Exam09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.print("정수를 입력하시오:");
		data = sc.next();
		char ch;
		System.out.println("천의 자리:" + data.charAt(0) );
		System.out.println("백의 자리:" + data.charAt(1) );
		System.out.println("십의 자리:" + data.charAt(2) );
		System.out.println("일의 자리:" + data.charAt(3) );

		}

	}

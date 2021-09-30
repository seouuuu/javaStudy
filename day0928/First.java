//연습) 사용자한테 문자열을 입력받아 첫번째 문자를 출력

import java.util.Scanner;
class  First
{
	public static void main(String[] args) 
	{
	String data;
	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요");
	data = sc.next();
	char last = data.charAt(0);
	System.out.println(last);

	}
}

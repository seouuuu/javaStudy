//연습) 사용자한테 문자열을 입력받아 문자열의 길이가 4글자 이상이면 true
//아니면 false를 출력

import java.util.Scanner;
class Length4 
{
	public static void main(String[] args) 
	{ Scanner sc = new Scanner(System.in);
	String  data;
	System.out.println("문자열을 입력하세요");
	data = sc.next();
	boolean flag;
	flag = data.length()>=4;
	System.out.println(flag);
	}
}

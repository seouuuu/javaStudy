import java.util.Scanner;
class Program7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min=0;
		System.out.print("첫번째 정수를 입력하세요==>");
		a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요==>");
		b = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요==>");
		c = sc.nextInt();
		if (a<=b && a<=c){
			min =a;
		} else if(b<=c && b<=a){
			min =b;
		}else if(c<=b && c<=a){
			min =c;
		}
		System.out.println("가장 작은 값은 "+min+"입니다.");
	}
}

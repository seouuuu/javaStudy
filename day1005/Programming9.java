import java.util.Scanner;
class Programming9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x,f=0;
		System.out.print("실수 x를 입력하세요==>");
		x = sc.nextDouble();
		if (x<=0){
			f = x*x*x - 9*x +2;
		} else if (x>0){
			f = 7*x +2;
		}
		System.out.println("결과: "+ f );
	}
}

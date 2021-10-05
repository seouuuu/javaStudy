import java.util.Scanner;
class  Programming01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char op;
		int a,b;
		System.out.print("연산자를 입력하세요==>");
		op = sc.next().charAt(0);
		System.out.print("첫번째 수를 입력하세요==>");
		a = sc.nextInt();
		System.out.print("첫번째 수를 입력하세요==>");
		b = sc.nextInt();
		if (op == '+'){
			System.out.println(a + "+" + b+"="+ (a+b));
		} else if (op =='-'){
			System.out.println(a + "-" + b+"="+(a-b));
		}else if (op =='*'){
			System.out.println(a + "*" + b+"="+(a*b));
	   }else if (op =='/'){
		   if (b ==0){
			   System.out.println("분모가 0이 될 수는 없습니다.");
		   }else
			System.out.println(a + "/" + b+"="+(a/b));
	   } else{
		System.out.println("잘못된 연산자 입니다.");
	   }
    }
}
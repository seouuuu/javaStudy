import java.util.Scanner;
class Program1 
{ public static void main(String[] args) 
	{  Scanner sc = new Scanner(System.in);
		char cal; //한글자 여서 char
		int a,b;
		System.out.print("사칙연산 +,-,*,/ 중 하나를 입력하세요==>");
		cal = sc.next().charAt(0); //char입력
		if (cal == '+' || cal== '-' || cal== '*' ||cal=='/'){
			System.out.print("첫번째 수를 입력하세요");
			a = sc.nextInt();
			System.out.print("두번째 수를 입력하세요");
			b = sc.nextInt();
			if (cal == '+'){
				System.out.println(a + b);
			} else if ( cal =='-'){
				System.out.println(a - b);
			} else if ( cal == '*'){
				System.out.println(a * b);
			} else if ( cal =='/'){
				if (b == 0){
					System.out.println("분모가 0 이기 때문에 나눗셈을 할 수 없습니다.");
				} else
					System.out.println(a / b);
			} 
		}
		else
			System.out.println("잘못 입력하셨습니다.");
	}
}

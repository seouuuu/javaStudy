import java.util.Scanner;
class  Program2 
{ public static void main(String[] args) 
	{  Scanner sc = new Scanner(System.in);
		char data;
		int a,b,c,d,e;
	    System.out.print("R,T,C 중 하나를 입력하세요==>");
		data = sc.next().charAt(0);
		if (data == 'R'){
			System.out.print("사각형의 가로를 입력하세요==>");
			a = sc.nextInt();
			System.out.print("사각형의 세로를 입력하세요==>");
			b = sc.nextInt();
			System.out.println("사각형의 면적은 "+(a*b)+"입니다.");
		}else if (data == 'T'){
			System.out.print("삼각형의 밑변을 입력하세요==>");
			c = sc.nextInt();
			System.out.print("삼각형의 높이를 입력하세요==>");
			d = sc.nextInt();
			System.out.println("삼각형의 면적은 "+((c*d)/2)+"입니다.");
		}else if (data=='C'){
			System.out.print("원의 반지름을 입력하세요==>");
			e = sc.nextInt();
			System.out.println("원의 면적은 "+(e*e)+"π입니다.");
		}
		}
	}


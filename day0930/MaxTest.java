import java.util.Scanner;
class MaxTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,max;
		System.out.print("첫번째 수를 입력하세요==>");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하세요==>");
		b = sc.nextInt();
		System.out.print("세번째 수를 입력하세요==>");
		c = sc.nextInt();
		
		if (a>b){
			if (a>c){    // 중첩선택문
				max =a;
		   } else{       // 중첩선택문에서 else가 오면 가장 가까운 if에 대응됨
			   max =c;
		   }
		}else {
			if(b>c){
				max =b;
			}else{
				max = c;
			}
		}
		System.out.println("가장 큰 수는 "+ max +" 입니다.");
	}
}

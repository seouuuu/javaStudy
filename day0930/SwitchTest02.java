import java.util.Scanner;
class SwitchTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0~9 사이의 수를 입력하세요==>");
		n = sc.nextInt();
		switch(n){
			case 0: 
			case 1:
			case 2:
			case 3: System.out.println("삼"); break;
			case 4: 
			case 5: 
			case 6: 
			case 7: System.out.println("칠"); break;
			case 8:
			case 9: 
			default: System.out.println("입력범위를 넘었습니다.");
		}
		System.out.println("종료");
	}
}

import java.util.Scanner;
class Lab01 
{
	public static void main(String[] args) 
	{
		int score;
		Scanner input = new Scanner(System.in);
		System.out.printf("성적을 입력하시오");
		score = input.nextInt();
		/*
		String result = (score>=60)?"합격":"불합격";
		System.out.println(result);
		System.out.println((score>=60)?"합격":"불합격");
	
		if ( score>=60){
			System.out.println("합격!");
			System.out.println("축하합니다.");
		}
		else{
			System.out.println("불합격!");
			System.out.println("종료");
			*/
		if (score<50){
			System.out.println("불합격입니다.");
		}else if ( score<60 ){
			System.out.println("안타깝게 불합격입니다.");
		}else if ( score<70 ){
			System.out.println("합격입니다.");
		}else if ( score<80 ){
			System.out.println("우수하게 합격하였습니다.");
		}else{
			System.out.println("아주 우수하게 합격하였습니다.");
		}
	}
}

import java.util.Scanner;
class MonSeason 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int mon;
		String season="";
		System.out.print("월을 입력하세요==>");
		mon = sc.nextInt();
		switch(mon){
			case 1: season="겨울";break;
			case 2: season="겨울";break;
			case 3: season="봄";break;
			case 4: season="봄";break;
			case 5: season="봄";break;
			case 6: season="여름";break;
			case 7: season="여름";break;
			case 8: season="여름";break;
			case 9: season="가을";break;
			case 10: season="가을";break;
			case 11: season="가을";break;
			case 12: season="겨울";break;
		}
		System.out.println(mon+"월은 "+season+"입니다.");
	
}

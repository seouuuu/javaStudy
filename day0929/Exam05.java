import java.util.Scanner;
class  Exam05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int time,hour,min,sec;
		System.out.print("시간을 초단위로 입력하세요==>");
		time = sc.nextInt();
		hour = time / 3600;
		min = (time % 3600) / 60;
		sec = ((time % 3600) % 60);
		System.out.print(time +"초는 " +hour +"시간 " +min+" 분 "+sec+" 초 입니다.");
	}
}
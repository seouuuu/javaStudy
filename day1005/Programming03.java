import java.util.Scanner;
class  Programming03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price = 100;
		int cnt,total;
		System.out.print("물건의 구매수량을 입력하세요==>");
		cnt = sc.nextInt(0);
		total = price * cnt;
		if (cnt>=10){
			total = (int)(total * 0.9);
		}
		System.out.println("전체가격은 "+total +"입니다.");
	}
}

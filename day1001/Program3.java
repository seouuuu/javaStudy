import java.util.Scanner;
class Program3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		double price;
		System.out.print("구입한 개수를 입력하세요==>");
		num = sc.nextInt();
		if ( num >= 10){
			price = (100.0*num)*0.9;
		} else
		price = 100.0*num;
		System.out.println("구입가격 : "+ price + "원");
	}
}

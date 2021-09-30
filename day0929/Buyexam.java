import java.util.Scanner;
class  Buyexam
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int buy,money,tot;
		double sale;
		System.out.print("상품명을 입력하세요==>");
		name = sc.next();
		System.out.print("단가를 입력하세요==>");
		money = sc.nextInt();
		System.out.print("구매수량을 입력하세요==>");
		buy = sc.nextInt();
		tot = money * buy;
		if( buy>=10 || tot>=20000 )
			{ sale = (double)tot *0.9;
			System.out.println("지급금액은 "+sale+"입니다.");}
		else
			System.out.println("지급금액은" +tot+"원 입니다. ");
	}
}

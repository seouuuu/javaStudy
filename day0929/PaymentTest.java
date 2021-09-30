import java.util.Scanner;
class PaymentTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String item;
		int price,qty,total;
		System.out.print("상품명을 입력하시오==>");
		item = sc.next();
		System.out.print("상품의 단가를 입력하시오==>");
		price = sc.nextInt();
		System.out.print("구매수량을 입력하시오==>");
		qty = sc.nextInt();
		total = price *qty;

		System.out.println("** 결과 출력 **");
		System.out.println("상품명:" + item);
		System.out.println("단가:" + price);
		System.out.println("수량:" + qty);
		System.out.println("총금액:" + total);

		if(qty>=10 || total >=20000)
			System.out.println("지불 금액은 10% 할인하여"+(total*0.9)+"원 입니다.");
		else
			System.out.println("지불 금액은"+total+"원 입니다.");
	}
}

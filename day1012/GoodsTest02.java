class Goods
{
	private String item;
	private int qty;
	private int price;
	public void setPrice(int p){
		price = p;
	}
	public int getPrice(){
		return price;
	}
	public void setQty(int q){
		qty = q;
	}
	public int getQty(){
		return qty;
	}
	public void setItem(String i){
		item =i;
	}
	public String getItem(){
		return item;
	}
	public String toString(){
		String result="";
		result += "상품명: "+item+"\n";
		result += "수량: " + qty + "\n";
		result += "단가: " + price + "\n";
		return result;
	}
}
class GoodsTest02 
{
	public static void main(String[] args) 
	{
		Goods g1;
		g1 = new Goods();
		g1.setItem("축구공");
		g1.setQty(10);
		g1.setPrice(35000);
		//System.out.println("상품명: "+g1.getItem());
		//System.out.println("수량: "+g1.getQty());
		//System.out.println("단가: "+g1.getPrice());
		System.out.println(g1.toString());
		System.out.println(g1);
		int total = g1.getQty() * g1.getPrice();
		System.out.println("총금액: "+total);
	}
}

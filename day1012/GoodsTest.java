class Goods
{
	private String name;
	private int amount;
	private int price;

	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setAmount(int a){
		amount = a;
	}
	public int getAmount(){
		return amount;
	}
	public void setPrice(int p){
		price = p;
	}
	public int getPrice(){
		return price;
	}
	public String toString(){
		String result="";
		result += "��ǰ��: "+name +"\n";
		result += "����: " + amount + "\n";
		result += "�ܰ�: " + price + "\n";
		return result;
 	}
}
class GoodsTest
{
	public static void main(String[] args) 
	{
		Goods g = new Goods();
		g.setName("Ŀ��");
		g.setAmount(3);
		g.setPrice(3000);
		System.out.println(g);
	}
}

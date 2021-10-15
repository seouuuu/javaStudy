class Goods
{
	private String item;
	private int qty;
	public Goods(String item, int qty){
		this.item = item;
		this.qty = qty;
	}
	public Goods(){
	}
	public void setItem(String item){
		this.item = item;
	}
	public String getItem(){
		return item;
	}
	public void setQty(int qty){
		this.qty = qty;
	}
	public int getQty(){
		return qty;
	}
	public String toString(){
		return "��ǰ��: "+item+", ����: "+qty;
	}
	
}


class Exam02_CallByReferenceObject 
{
	public static void minusOne(Goods g){
		g.setQty(g.getQty()-1);       // item,qty�� public�̸� g.qty--; �̷��� ����
	}

	public static void main(String[] args) 
	{
		Goods g = new Goods("����",10);
		System.out.println(g);
		minusOne(g);
		System.out.println(g);
	}
}

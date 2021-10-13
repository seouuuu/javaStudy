class Box
{
	private double width;
	private double length;
	private double height;
	private boolean empty;
	private String things;   //���� ����
	public Box(double width, double length, double height){
		this.width = width;
		this.length = length;
		this.height = height;
		empty = true;
	}
	public Box(){
		width = 10;
		length = 10;
		height = 10;
		empty = true;
	}
	public String toString(){
		String r = "�������";
		if (!empty){ //empty == false
			r = "������� ����";
		}
		return "����: "+width+", ����: "+length+", ����: "+height+", "+r+", ��买��: "+things;
	}
	public void put(String things){
		this.things = things;
		empty = false;
		System.out.println("�ڽ��� "+things+"�� ��Ҿ��.");
	}
	public String take(){
		String r = things;
		things = "����";
		empty = true;
		return r;
	}
}
class BoxTest 
{
	public static void main(String[] args) 
	{
		Box b1 = new Box(10,20,30);
		Box b2 = new Box();
		System.out.println(b1);
		System.out.println(b2);
		b1.put("��");
		b2.put("å");
		System.out.println(b1);
		System.out.println(b2);
		String r = b2.take();
		System.out.println("�ڽ�2�� ��买��: "+r);
		System.out.println("=====================");
		System.out.println(b1);
		System.out.println(b2);
	}
}

class CellPhone
{
	String name;
	String company;
	String color;
	boolean power;
	boolean camera;
	void act(){
	if (power ){
		if(camera){
		System.out.printf("%sȸ���� %s���� ī�޶� ������ %s�� ������ �մϴ�.",company,color,name);
		} else
			System.out.printf("%sȸ���� %s���� ī�޶� �������� %s�� ������ �մϴ�.",company,color,name);
	} else if(power){
		if(camera){
		System.out.printf("%sȸ���� %s���� ī�޶� ������ %s�� ������ ���ϴ�.",company,color,name);
		} else
			System.out.printf("%sȸ���� %s���� ī�޶� �������� %s�� ������ ���ϴ�.",company,color,name);
	}
  }
}
class CellPhoneTest 
{
	public static void main(String[] args) 
	{
		CellPhone c = new CellPhone();
		c.name = "������";
		c.company = "�Ｚ����";
		c.color = "����";
		c.power =true;
		c.camera = false;
		c.act();
	}
}

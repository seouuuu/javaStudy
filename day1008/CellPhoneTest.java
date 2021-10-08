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
		System.out.printf("%s회사의 %s색의 카메라가 장착된 %s의 전원을 켭니다.",company,color,name);
		} else
			System.out.printf("%s회사의 %s색의 카메라가 미장착된 %s의 전원을 켭니다.",company,color,name);
	} else if(power){
		if(camera){
		System.out.printf("%s회사의 %s색의 카메라가 장착된 %s의 전원을 끕니다.",company,color,name);
		} else
			System.out.printf("%s회사의 %s색의 카메라가 미장착된 %s의 전원을 끕니다.",company,color,name);
	}
  }
}
class CellPhoneTest 
{
	public static void main(String[] args) 
	{
		CellPhone c = new CellPhone();
		c.name = "갤럭시";
		c.company = "삼성전자";
		c.color = "검정";
		c.power =true;
		c.camera = false;
		c.act();
	}
}

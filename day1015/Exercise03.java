//public class Bike
class Bike
{
	//private int gear;
	protected int gear;
	public int speed;
	public Bike(){         
	}
}
//public class MountainBike expends Bike
class MountianBike extends Bike
{
	public int seatHeight;
	//public void MountainBike(int g){
	public MountainBike(int g){      //생성자이름 왼쪽에는 void 사용x
		super();
		gear = g;//부모클래스의 private 영역에 접근할 수 없기때문에 setter 또는 protected 사용
	}
}

class Exercise03
{
	public static void main(String[] args) 
	{
	}
}
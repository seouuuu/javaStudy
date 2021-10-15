//public class Bike
class Bike
{
	//private int gear;
	protected int gear;
	//public int speed;
	protected int speed;
	public Bike(){         //기본생성자
	}
}
//public class MountainBike expends Bike
class MountianBike extends Bike
{
	public int seatHeight;
	public void MountainBike(int g){
		super();
		gear = g;
	}
}

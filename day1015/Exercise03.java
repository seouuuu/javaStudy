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
	public MountainBike(int g){      //�������̸� ���ʿ��� void ���x
		super();
		gear = g;//�θ�Ŭ������ private ������ ������ �� ���⶧���� setter �Ǵ� protected ���
	}
}

class Exercise03
{
	public static void main(String[] args) 
	{
	}
}
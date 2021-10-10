class Box
{
	int width;
	int length;
	int height;

	int getVolume(){
		int vol = width * length * height;
		return vol;
	}
}
	
class BoxTest
{
	public static void main(String[] args) 
	{
		Box box1 = new Box();
		box1.width = 100;
		box1.length = 100;
		box1.height = 100;
		System.out.println(box1.getVolume());
		System.out.println(box1);

		Box box2 = new Box();
		box2.width = 200;
		box2.length = 200;
		box2.height = 200;

	}
}

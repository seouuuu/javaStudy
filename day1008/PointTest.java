class Point
{
	int x;
	int y;
	public int getX(int x,int y){
		System.out.printf("(%d,%d)",x,y);
	}
	public void setX(int xCoord){
		
	}
}

class  PointTest
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		p1.x = 100;
		p1.y = 200;
	}
}

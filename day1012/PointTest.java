class Point{
	int x;
	int y;
	public int getX(){
		return x;
	}
	public void setX(int xCoord){
		x = xCoord;
	}
	public int getY(){
		return y;
	}
	public void setY(int yCoord){
		y = yCoord;
	}
}
class  PointTest{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);
		System.out.printf("첫번째 객체의  x:%d,y:%d\n",p1.getX(),p1.getY());
		System.out.printf("두번째 객체의  x:%d,y:%d",p2.getX(),p2.getY());
	}
}

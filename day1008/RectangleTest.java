class Rectangle
{
	double width;
	double height;
	double getArea(){
		double area =width*height;
		return area;
	}
}

class RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle s = new Rectangle();
		s.width = 5.6;
		s.height = 13.2;
		System.out.printf("�簢���� ���̴� %.1f�Դϴ�.",s.getArea());
	}
}

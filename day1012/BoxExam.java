class Box
{
	private int width;
	private int length;
	private int height;
	private boolean empty;

	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public int getHeight(){
		return height;
	}
	public void setLength(int Length){
		this.length = length;
	}
	public int getLength(){
		return length;
	}

	public Box(){
	}
	public Box(int width,int length,int height){
		this.width = width;
		this.length = length;
		this.height = height;
	}
	public Box(int height){
		this.height = height;
	}
	public String toString(){
		return "가로: " + width +", 세로: "+length+", 높이: "+height;
	}
}

class  BoxExam
{
	public static void main(String[] args) 
	{
		Box b1 = new Box(3,5,8);
		Box b2 = new Box(5);
	
		Box b4 = new Box();

		System.out.println(b1);
		System.out.println(b2);

		System.out.println(b4);

	}
}

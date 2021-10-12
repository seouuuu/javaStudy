class Box{
	int width;
	int length;
	int height;
	public int getHeight(){
		return height;
	}
	public void setHeight(int h){
		height = h;
	}
	public int getLength(){
		return length;
	}
	public void setLength(int l){
		length = l;
	}
	public void setWidth(int w){
		width = w;
	}
	public int getWidth(){
		return width;
	}
	public int getVolume(){
		int volume = width * length*height;
		return volume;
	}
	public String toString(){
		String result ="가로:" + width +", 세로:"+length+", 높이:"+ height;
		return result;
	}
}
class  BoxTest{
	public static void main(String[] args) 
	{
		Box box1;
		box1 = new Box();
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		System.out.println(box1.getVolume());
		System.out.println(box1);
		Box box2 = new Box();
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		box1 = box2;
		System.out.println(box1.getWidth());
		System.out.println(box2.getWidth());
	}
}

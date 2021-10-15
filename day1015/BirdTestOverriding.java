class Bird
{
	protected String name;
	protected String color;
	protected boolean wing;
	public Bird(String name,String color,boolean wing){
		this.name = name;
		this.color = color;
		this.wing = wing;
	}
	public Bird(){
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setWing(boolean wing){
		this.wing = wing;
	}
	public boolean getWing(){
		return wing;
	}

	public void fly(){
		if (wing == true){
			System.out.printf("%s�� %s��(��) ��~��~\n",color,name);
		}else{
			System.out.printf("%s�� %s��(��) �� �� �����\n",color,name);
		}
	}
}

class Airplane extends Bird
{
	private boolean engine;
	public Airplane(String name,String color,boolean wing,boolean engine){
		super(name,color,wing);
		this.engine = engine;
	}
	public Airplane(){
	}
	public void setEngine(boolean engine){
		this.engine = engine;
	}
	public boolean getEngine(){
		return engine;
	}
	public void fly(){
		if (wing && engine){
			System.out.printf("%s�� %s��(��) ��~��~\n",color,name);
		}else{
			System.out.printf("%s�� %s��(��) �� �� �����!\n",color,name);
		}
	}
}

class BirdTestOverriding 
{
	public static void main(String[] args) 
	{
		Bird b1 = new Bird("����","���",true);
		Bird b2 = new Bird("��ѱ�","����",false);
		b1.fly();
		b2.fly();

		Airplane a1 = new Airplane("����747","�ϴ�",true,true);
		a1.fly();
	}
}

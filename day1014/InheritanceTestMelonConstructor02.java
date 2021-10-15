class Food
{
	protected double calories;
	protected int price;
	protected double weight;

	public Food(double calorieds,int price,double weight){
		this.calories = calories;
		this.price = price;
		this.weight = weight;
	}
	public Food(){
	}

	public void setCalories(double calories){
		this.calories = calories;
	}
	public double getCalories(){
		return calories;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}

	public String toString(){
		return "Į�θ�:"+calories+", ����:"+price+", �߷�:"+weight;
	}
}

class Melon extends Food
{
	private String farm;
	public Melon(double calories, int price, double weight,String farm){
		super(calories,price,weight);
		this.farm = farm;
	}
	public Melon(){
		//super(); ����
	}
	public void setFarm(String farm){
		this.farm = farm;
	}
	public String getFarm(){
		return farm;
	}
	public String toString(){
		//return "Į�θ�:"+calories+", ����:"+price+", �߷�:"+weight+", ���۳��:"+farm;
		return super.toString()+", ���۳��:"+farm;
	}
}

class Milk extends Food
{
	private String brand;
	public Milk(double calories, int price, double weight,String brand){
		super(calories,price,weight);
		this.brand = brand;
	}
	public Milk(){
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	
	public String toString(){
		return super.toString()+", �귣��:"+brand;
	}
}


class InheritanceTestMelonConstructor02
{
	public static void main(String[] args) 
	{
		Food f = new Food(200,5000,0.6);
		System.out.println(f);

		Melon m = new Melon(450,17000,1.4,"�������");
		System.out.println(m);

		Milk k = new Milk(300,2500,0.5,"�������");
		System.out.println(k);
	}
}

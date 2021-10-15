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
		return "칼로리:"+calories+", 가격:"+price+", 중량:"+weight;
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
		//super(); 생략
	}
	public void setFarm(String farm){
		this.farm = farm;
	}
	public String getFarm(){
		return farm;
	}
	public String toString(){
		return "칼로리:"+calories+", 가격:"+price+", 중량:"+weight+", 경작농원:"+farm;
	}
}


class InheritanceTestMelonConstructor
{
	public static void main(String[] args) 
	{
		Food f = new Food(200,5000,0.6);
		System.out.println(f);

		Melon m = new Melon(450,17000,1.4,"생생농원");
		System.out.println(m);
	}
}

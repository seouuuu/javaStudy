class Food
{
	protected double calories;
	protected int price;
	protected double weight;

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
}

class Melon extends Food
{
	private String farm;
	public void setFarm(String farm){
		this.farm = farm;
	}
	public String getFarm(){
		return farm;
    }

	public void printMelon(){
		System.out.printf("Ä®·Î¸®: %f\n",calories);
		System.out.printf("°¡°Ý: %d ¿ø\n",price);
		System.out.printf("Áß·®: %.1f kg\n",weight);
		System.out.printf("°æÀÛ³ó¿ø: %s\n",farm);
	}
}

class InheritanceTestMelon02 
{
	public static void main(String[] args) 
	{
		Melon m = new Melon();
		m.setCalories(450);
		m.setPrice(15000);
		m.setWeight(1.2);
		m.setFarm("½Ö¿ë³ó¿ø");
		m.printMelon();
	}
}

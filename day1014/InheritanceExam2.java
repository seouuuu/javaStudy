class Food
{
	protected int calorie;
	protected int price;
	protected double weight;

	public void setCalorie(int calorie){
		this.calorie = calorie;
	}
	public int getCalorie(){
		return calorie;
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
		System.out.printf("Į�θ�:%dkcal\n",calorie);
		System.out.printf("����:%d��\n",price);
		System.out.printf("�߷�:%.1fg\n",weight);
		System.out.printf("���۳��:%s\n",farm);
	}
}


class InheritanceExam2 
{
	public static void main(String[] args) 
	{
		Melon m = new Melon();
		m.setCalorie(30);
		m.setPrice(5000);
		m.setWeight(500);
		m.setFarm("�������");

		m.printMelon();
	}
}

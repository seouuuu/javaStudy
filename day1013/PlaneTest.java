class Plane
{
	private String company;
	private String model;
	private int passenger;
	public static int planes;

	public void setCompany(String company){
		this.company = company;
		planes++;
	}
	public String getCompany(){
		return company;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	public void setPassenger(int passenger){
		this.passenger = passenger;
	}
	public int getPassenger(){
		return passenger;
	}
	public Plane(){
		plane++;
	}
	public Plane(String company, String model,int passenger){
		this.company = company;
		this.model = model;
		this.passenger = passenger;
		planes++;
	}
	public Plane(int passenger){
		this.passenger = passenger;
		planes++;
	}
	public String toString(){
		return "제작사: " + company +", 모델: "+model + ", 최대승객수: "+passenger+",비행기의 수: "+planes;
	}
	
	public static int getPlanes(){
		return planes;
	}
}

class PlaneTest
{
	public static void main(String[] args) 
	{
		Plane p1 = new Plane();
		Plane p2 = new Plane();

		p1.setCompany ("에어버스");
		p1.setModel("A380");
		p1.setPassenger(500);
		System.out.printf("제작사: %s, 모델: %s, 최대 승객수: %d\n ",p1.getCompany(),p1.getModel(),p1.getPassenger());

		p1.setCompany ("에어버스");
		p1.setModel("A480");
		p1.setPassenger(700);
		System.out.println(p1);

	}
}

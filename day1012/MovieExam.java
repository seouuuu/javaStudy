class Movie
{
	private String name;
	private String director;
	private String manufac;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return director;
	}
	public void setManufac(String manufac){
		this.manufac = manufac;
	}
	public String getManufac(){
		return manufac;
	}

	public Movie(){
	}
	public Movie(String name){
		this.name = name;
	}
	public Movie(String name,String director, String manufac){
		this.name = name;
		this.director = director;
		this.manufac = manufac;
	}
	public Movie (String director, String manufac){
		this.director = director;
		this.manufac = manufac;
	}
	public String toString(){
		return "����: " +name +", ����: "+director+", ���ۻ�: "+ manufac;
	}
}
class MovieExam 
{
	public static void main(String[] args) 
	{
		Movie a = new Movie();
		System.out.println(a);
		Movie b = new Movie("Ÿ��Ÿ��");
		System.out.println(b);
		Movie c = new Movie("�����","����ȣ","�ٸ����̾ؿ���");
		System.out.println(c);
		Movie d = new Movie("������","���׿���");
		System.out.println(d);
	}
}
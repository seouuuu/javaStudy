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
		return "제목: " +name +", 감독: "+director+", 제작사: "+ manufac;
	}
}
class MovieExam 
{
	public static void main(String[] args) 
	{
		Movie a = new Movie();
		System.out.println(a);
		Movie b = new Movie("타이타닉");
		System.out.println(b);
		Movie c = new Movie("기생충","봉준호","바른손이앤에이");
		System.out.println(c);
		Movie d = new Movie("이준익","씨네월드");
		System.out.println(d);
	}
}

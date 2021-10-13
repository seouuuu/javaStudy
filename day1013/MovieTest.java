class Movie
{
	private String title;
	private String director;
	private String company;

	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return director;
	}
	public void setCompany(String company){
		this.company = company;
	}
	public String getCompany(){
		return company;
	}

	public Movie(String title,String director,String company){
		this.title = title;
		this.director = director;
		this.company = company;
	}
	public Movie(){
		this("����","����","ȸ��");
	}

	public String toString(){
		return "[title: "+title+", director: "+director+", company: "+company+"]";
	}
}

class MovieTest 
{
	public static void main(String[] args) 
	{
		Movie m1 = new Movie("�ٶ��� �Բ� �������","���� �÷���","���͸����Ľ�");
		Movie m2 = new Movie();
		System.out.println(m1);
		System.out.println(m2);
		m2.setTitle("�𰡵�");
		m2.setDirector("���¿�");
		m2.setCompany("�Ե�����");
		System.out.println(m2);
	}
}

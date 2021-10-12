class Emp
{
	private int eno;
	private String ename;
	private int esal;
	private String ehiredate;
	private String dname;
	public String toString(){
		return "사원번호: " + eno + ", 사원이름: " + ename +", 봉급: "+esal+", 입사일:"+ehiredate+", 부서명:"+ename;
	}
	public void setEno(int eno){
		this.eno = eno;
	}
	public int getEno(){
		return eno;
	}
	public void setEname(String ename){
		this.ename = ename;
	}
	public String getEname(){
		return ename;
	}
	public void setEsal(int esal){
		this.esal = esal;
	}
	public int getEsal(){
		return esal;
	}
	public void setEhiredate(String ehiredate){
		this.ehiredate = ehiredate;
	}
	public String getEhiredate(){
		return ehiredate;
	}
	public void setDname(String dname){
		this.dname=dname;
	}
	public String getDname(){
		return dname;
	}
	public Emp(int eno,String ename,int esal,String ehiredate,String dname){
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.ehiredate = ehiredate;
		this.dname = dname;
	}
}

class EmpTest 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(1000,"홍길동",500,"2020/01/05","총무부");
		Emp e2 = new Emp(2000,"김유신",600,"2021/11/15","개발팀");
		System.out.println(e1);
		System.out.println(e1);

		e1.setEsal(600);
		e1.setEsal(600);
		System.out.println(e1.getEname()+", "+e1.getEsal());
		System.out.println(e2.getEname()+", "+e2.getEsal());
	}
}

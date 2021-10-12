class Dept
{
	private int dno;
	private String dname;
	private String dloc;
	public Dept(){
		dno = 10;
		dname = "총무부";
		dloc = "서울";
	}
	public void setDno(int Dno){
		this.dno = dno;
	}
	public int getDno(){
		return dno;
	}
	public void setDname(String dname){
		this.dname = dname;
	}
	public String getDname(){
		return dname;
	}
	public void setDloc(String dloc){
		this.dloc = dloc;
	}
	public String getDloc(){
		return dloc;
	}
	public String toString(){
		String result = "부서번호: "+dno+",부서명:  "+dname+", 부서위치: "+dloc ;
		return result;
	}
}

class DeptTest 
{
	public static void main(String[] args) 
	{
		Dept d = new Dept();
		System.out.println("부서번호: "+ d.getDno());
		System.out.println("부서이름: "+ d.getDname());
		System.out.println("부서위치: "+ d.getDloc());

		d.setDloc("제주도");
		System.out.println(d);
	}
}

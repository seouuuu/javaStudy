class Dept
{
	private int dno;
	private String dname;
	private String dloc;
	public Dept(){
		dno = 10;
		dname = "�ѹ���";
		dloc = "����";
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
		String result = "�μ���ȣ: "+dno+",�μ���:  "+dname+", �μ���ġ: "+dloc ;
		return result;
	}
}

class DeptTest 
{
	public static void main(String[] args) 
	{
		Dept d = new Dept();
		System.out.println("�μ���ȣ: "+ d.getDno());
		System.out.println("�μ��̸�: "+ d.getDname());
		System.out.println("�μ���ġ: "+ d.getDloc());

		d.setDloc("���ֵ�");
		System.out.println(d);
	}
}

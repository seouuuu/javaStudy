class BankAccount
{
	private String name;
	private int account;
	private int balance;
	private double interest;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAccount(int account){
		this.account = account;
	}
	public int getAccount(){
		return account;
	}
	public void setInterest(double Interest){
		this.interest = interest;
	}
	public double getInterest(){
		return interest;
	}

	public BankAccount(String name, int account, int balance, double interest){
		this.name = name;
		this.account = account;
		this.balance = balance;
		this.interest = interest;
	}
	public BankAccount(String name, int account){
		this.name = name;
		this.account = account;
		interest = 0.01;
	}
	public String toString(){
		return  "�̸�: "+name+", ���¹�ȣ: "+account+", �ܾ�: "+balance+", ������: "+interest;
	}
}

class  BankAccountExam
{
	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount("ȫ�浿",100100,1000000,0.1);
		BankAccount b2 = new BankAccount("�̼���",100200);

		System.out.println(b1);
		System.out.println(b2);
	}
}

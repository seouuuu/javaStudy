class BankAccount{
	int balance;
	public void deposit(int amount){
		balance +=amount;
	}
	public void withdraw(int amount){
		if(amount<=balance){
			balance -= amount;
			} else{
				System.out.println("�ܾ��� �����մϴ�.");
			}
	}
	public int getBalance(){
		return balance;
	}
	public void printBalance(){
		System.out.printf("�����ܾ� : %d\n",balance);
	}
	public void addInterest(){
		balance *=1.075;
	}
}
class  BankAccountTest02{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		a1.deposit(100);
		a2.deposit(50);
		a1.withdraw(60);
		a2.withdraw(30);
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		//System.out.println(a1.printBalnace()); //��ȯ���� ���� �޼ҵ带 ��¹��� ȣ�� �� �� ����
		a1.printBalance();
		a2.printBalance();
		a1.addInterest();
		a2.addInterest();
		a1.printBalance();
		a2.printBalance();
		a1.withdraw(100);
		a2.withdraw(100);
		a1.printBalance();
		a2.printBalance();
	}
}

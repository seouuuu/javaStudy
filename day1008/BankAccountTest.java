class BankAccount                                 
{
	int balance;
	double balance2;
	void deposit(int amount){						
		balance += amount;
	}
	void withdraw(int amount){					
		if(balance>=0){
		balance -= amount;
		} 
	}
	int getBalance(){
		return balance;
	}
	void addInterest(int year){
		balance2 = balance*1.075;
	}
	void printBalance(){
		System.out.printf("ÇöÀçÀÜ¾× = %.1f\n",balance2);
	}
}

class BankAccountTest 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		a1.balance = 100;
		a2.balance = 50;
		a1.withdraw(60);
		a2.withdraw(30);
		a1.addInterest(1);
		a2.addInterest(2);
		a1.printBalance();
		a2.printBalance();




	}
}

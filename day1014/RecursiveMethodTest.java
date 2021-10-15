class RecursiveMethodTest 
{
	public static int getFactorial(int n){
		if (n==1){
			return 1;              //끝나는 조건이 없으면 계속 반복,조건에 따라 다른 값
		}
		return n *getFactorial(n-1);
	}


	public static int getSum(int n){
		if (n==1){
			return 1;
		}
		return n+getSum(n-1);
	}

	public static void main(String[] args) 
	{
		System.out.printf("5!=%d\n",getFactorial(5));
		System.out.printf("7!=%d\n",getFactorial(7));
		System.out.printf("1에서 10까지의 합은 %d\n",getSum(10));
	}
}

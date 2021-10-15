class RecursiveMethodTest 
{
	public static int getFactorial(int n){
		if (n==1){
			return 1;              //������ ������ ������ ��� �ݺ�,���ǿ� ���� �ٸ� ��
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
		System.out.printf("1���� 10������ ���� %d\n",getSum(10));
	}
}

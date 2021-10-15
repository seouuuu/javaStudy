class SumExam 
{
	public static int getSum(int n){
		if (n==1){
			return 1;
		}
		return n+getSum(n-1);
	}
	public static void main(String[] args) 
	{
		System.out.printf("%d까지의 합: %d\n",5,getSum(5));
		System.out.printf("%d까지의 합: %d\n",10,getSum(10));
	}
}

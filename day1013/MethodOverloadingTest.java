class SistUtil
{
	public void max(int a, int b){
		int n = a;
		if (b>n){
			n = b;
		}
		System.out.println("ū ��: "+ n);
	}
	public void max(double a, double b){
		double n = a;
		if (b>n){
			n = b;
		}
		System.out.println("ū ��: "+ n);
		
 }
}
class  MethodOverloadingTest
{
	public static void main(String[] args) 
	{
	   SistUtil num = new SistUtil();
	   num.max(20,50);
	   num.max(45.2,4.3);
	}
}

class SistUtil
{
	public static void max(int a, int b){
		max((double)a,(double)b);        //필요하면 메소드 안에서 다른 메소드 호출 가능
	}
	public static void max(double a, double b){
		double n = a;
		if (b>n){
			n = b;
		}
		System.out.println("큰 수: "+ n);
   }
}
class  MethodOverloadingTest03
{
	public static void main(String[] args) 
	{
	   SistUtil.max(20,50);
	   SistUtil.max(45.2,4.3);
	}
}

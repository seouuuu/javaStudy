class SistUtil
{
	public static void max(double a, double b){
		double n = a;
		if (b>n){
			n = b;
		}
		System.out.println("Å« ¼ö: "+ n);
   }
}
class  MethodOverloadingTest04
{
	public static void main(String[] args) 
	{
	   SistUtil.max(20,50);
	   SistUtil.max(45.2,4.3);
	}
}

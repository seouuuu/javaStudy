class SistUtil
{
	public static void max(int a, int b){
		max((double)a,(double)b);        //�ʿ��ϸ� �޼ҵ� �ȿ��� �ٸ� �޼ҵ� ȣ�� ����
	}
	public static void max(double a, double b){
		double n = a;
		if (b>n){
			n = b;
		}
		System.out.println("ū ��: "+ n);
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

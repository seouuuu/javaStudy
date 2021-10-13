class MyUtil
{
	public static int max(int a, int b){
		int result = a;
		if (b>result){
			result = b;
		}
		return result;
	}
	/*
	public static int max(int a, int b, int c){
		int result = max(a,b);
		result = max(result,c);
		return result;
	}
	*/
	public static int max(int a, int b, int c){
		return max(max(a,b),c);
	}
	public static int max(int a, int b, int c, int d){
		return max(max(a,b),max(c,d));
	}
}

class  MethodOverloadingTest05
{
	public static void main(String[] args) 
	{
	   System.out.println(MyUtil.max(10,20));
	   System.out.println(MyUtil.max(1,2,3,4));
	   System.out.println(MyUtil.max(7,11,200));
	}
}

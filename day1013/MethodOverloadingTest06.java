class MyUtil
{
	public static int add(int []arr){
		int sum = 0;
		for (int i: arr ){
			sum += i;
		}
		return sum;
	}	
	public static double add(double []arr){
		double sum = 0;
		for (double i: arr ){
			sum += i;
		}
		return sum;
	}
}
class MethodOverloadingTest06 
{
	public static void main(String[] args) 
	{
		int a[] ={10,20,30,40};
		double b[] ={5.1,3,4.3,13.5,10.7};
		System.out.printf("정수형 배열의 총합: %d\n",MyUtil.add(a));
		System.out.printf("실수형 배열의 총합: %.1f\n",MyUtil.add(b));
	}
}

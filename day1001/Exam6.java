class Exam6 
{
	public static void main(String[] args) 
	{
		int sum=0;//double sum=0;
		for ( int i=1 ; i<=30 ; i++  ){
			sum = sum + i*i;//sum = sum + Math.pow(i,2) ;
		}
		System.out.println(sum + 30);
	}
}

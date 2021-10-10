class MyUtil
{
	void gugudan(int dan){
		System.out.printf("**%s´Ü**\n",dan);
		for ( int i=1  ;i<=9 ;i++ )
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
}


class GugudanTest
{
	public static void main(String[] args) 
	{
		MyUtil m = new MyUtil();
		m.gugudan(3);
	}
}

class Program12 
{
	public static void main(String[] args) 
	{
		int i,j;
		for ( i=2; i<=100 ;  i++ ){
			int sum=0; // ��ġ Ȯ��
			for (  j=1 ;j <=i ; j++ ){
				if ( i%j==0){
					sum++;
				}
			}
			if (sum==2)
					System.out.print(i + " ");
		}
	}
}

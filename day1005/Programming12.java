class Programming12 
{
	public static void main(String[] args) 
	{
		for (int i=2 ;i<=100 ; i++ ){
			int cnt = 0; //À§Ä¡
			for (int k=2; k<i ; k++ ){
				if (i%k==0){
					cnt++;
				}
			}
			if (cnt == 0){
				System.out.print(i + " ");
			}
		}
	}
}

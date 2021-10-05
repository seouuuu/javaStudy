class SortArray 
{
	public static void main(String[] args) 
	{
		int []data = {5,2,3,9,1};
		int max,min;
		max = data[0];
		min = data[0];
		for ( int i =0 ; i<data.length;i++ ){
			for ( int j=i+1;j<data.length ; j++ ){
				if ( data[i]>data[j]  ){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				} 
			}
		}
		System.out.println("**오름차순 정렬결과**");
		for (int i=0 ; i<data.length ;i++ ){
			System.out.print(data[i] + " ");
		}
	}
}

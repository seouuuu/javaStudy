class  MaxOfArray
{
	public static void main(String[] args) 
	{
		int []arr = {9,3,7,15,2};
		int max,i;
		max = arr[0];
		for ( i=1 ;  i<arr.length ;i++  ){
			if ( max <arr[i]  ){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

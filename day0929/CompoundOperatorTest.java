class CompoundOperatorTest 
{
	public static void main(String[] args) 
	{
		int i =1;
		int sum = 0;
		
		//for( i=1   ; i<=3      ;  i++   ){
        for( i=1   ; i<=100      ;  i++   ){
			sum += i;
		}
		
		/*sum += i; // sum = sum + i 
		i++; // i = i + 1
		sum +=i;
		i++;
		sum+=i;
		*/
		System.out.println("i:"+i);
		System.out.println("sum:"+sum);
	}
}

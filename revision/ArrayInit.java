class ArrayInit
{
	static void init(double []values){
		for (int i = 0; i<values.length ;i++ ){
			values[i] = 0;
		}
	}
	static void printArray(double []data){
		for (int i=0; i<data.length ;i++ ){
			System.out.printf("%10.1f",data[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		double []arr = {4.3, 2.5, 7.5, 8.4};
		printArray(arr);
		init(arr);
		printArray(arr);
	}
}

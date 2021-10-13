class CallByReferenceArray 
{
	public static void printArray(int []arr){
		for (int i=0; i<arr.length;i++ ){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}
	public static void plusOne(int []arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i] +1;
		}
	}
	public static void main(String[] args) 
	{
		int []arr = {10,20,30};                       //이름 같아도 달라도 상관x
		printArray(arr);
		plusOne(arr);
		printArray(arr);
	}
}

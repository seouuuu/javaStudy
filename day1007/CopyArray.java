class CopyArray
{
	public static void main(String[] args) 
	{
		int []a ={1,2,3,4,5};
		int []b = new int[5];
		b=a; 

		System.out.println("a�迭�� ���");
		for(int i : a){
			System.out.printf("%5d",i);
		}
		System.out.println();
		System.out.println("b�迭�� ���");
		for(int i : b){
			System.out.printf("%5d",i);
		}

		a[0] =100;
		System.out.println("------------------------------------");
		System.out.println("a�迭�� ���");
		for(int i : a){
			System.out.printf("%5d",i);
		}
		System.out.println();
		System.out.println("b�迭�� ���");
		for(int i : b){
			System.out.printf("%5d",i);
		}
	}
}

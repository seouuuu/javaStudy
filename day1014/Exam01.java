class MyUtil
{
	public static int[] unionArray(int []a, int[]b){ //������ �迭
		int []result = new int[a.length + b.length];
		int i;                                       //for�� ���� ����
		for ( i=0;i<a.length ;i++ ){
			result[i] = a[i];                       //i=a.length �϶� for�� Ż��
		}
		for (int j=0;j<b.length ;j++ ){
			result[i++] = b[j];                     //i���� 1�� ����
		}
		return result;
	}
	public static double[] unionArray(double []a, double[]b){  //�Ǽ����迭
		double []result = new double[a.length + b.length];
		int i;
		for ( i=0;i<a.length ;i++ ){
			result[i] = a[i];
		}
		for (int j=0;j<b.length ;j++ ){
			result[i+j] = b[j];                       //�̷��Ե� ����
		}
		return result;
	}
	public static void printArray(int []arr){           //�迭 ��� ���
		for(int i:arr){
			System.out.printf("%10d",i);
		}
		System.out.println();
	}
	public static void printArray(double []arr){
		for(double i:arr){
			System.out.printf("%10.1f",i);
		}
		System.out.println();
	}
}



class Exam01
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3};
		int []b = {4,5,6,7};

		double []c = {5.4,3.4,2.6};
		double []d = {1.5,8.9};

		int []arr1 = MyUtil.unionArray(a,b);
		double []arr2 = MyUtil.unionArray(c,d);

		MyUtil.printArray(arr1);
		MyUtil.printArray(arr2);
	}
}

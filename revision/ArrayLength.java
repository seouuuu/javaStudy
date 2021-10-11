import java.util.Scanner;
class  ArrayLength
{
	static void printArray(double []data){
		for ( double i :  data ){
			System.out.printf("%10.1f",i);
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []arr;
		int n;
		System.out.print("배열의 길이: ");
		n = sc.nextInt();
		arr = new double[n];
		for (  int i=0; i<n; i++){
			System.out.printf("%d번째 값==>",i+1);
			arr[i] = sc.nextDouble();
		}
		printArray(arr);
	}
}

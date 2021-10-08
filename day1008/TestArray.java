import java.util.Scanner;
class TestArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []arr = new int[10];
		for (int i=0;i<arr.length ;i++ ){
			System.out.printf("%d번째 배열의 원소를 입력하세요==>",i+1);
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<arr.length; i++){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();

		for (int i : arr){
			System.out.printf("%5d",i);
		}
		System.out.println();
		
		for (int i=arr.length-1; i>=0; i--){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();

	}
}

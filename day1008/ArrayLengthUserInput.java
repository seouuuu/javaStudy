import java.util.Scanner;
class  ArrayLengthUserInput
{
	static void printArray(double []data){
		for (  double i :data ){
			System.out.printf("%10.1f",i);
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double [] readings;
		int n;
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���==>");
		n = sc.nextInt();
		readings = new double[n];
		for (int i=0; i<n; i++){
			System.out.printf("%d��° ���� �Է��ϼ���==>",i+1);
			readings[i] = sc.nextDouble();
		}

		printArray(readings);
	}
}

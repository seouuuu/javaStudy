import java.util.Scanner;
class StudentTest02 
{
	public static void main(String[] args) 
	{
		int []age = new int[5];
		Scanner sc = new Scanner(System.in);
		for( int i=0 ; i<age.length  ;i++ ){
			System.out.print((i+1) + "��° �л��� ���̸� �Է��Ͻÿ�==>"); // 0��° ���ʹϱ�
			age[i] = sc.nextInt();
		}
		int tot = 0;
		for (int i=0;i<age.length ;  i++ ){ //���� i�� ��ġġ ���� �ݺ��� ���̱� ����
			tot += age[i];
		}
		double avg = (double) tot/ age.length;
		System.out.println("��ճ���:" + avg);
	}
}
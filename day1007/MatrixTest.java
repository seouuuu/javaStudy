class MatrixTest 
{
	public static void main(String[] args) 
	{
		int [][]a;
		a = new int[5][3];
		
		int n=1;
		for ( int i=0;i<5 ;i++ ){
			for (int j=0 ; j<3; j++){
				a[i][j] =n++;
			}
		}

		for (int i=0; i<5; i++){
			for (int j=0;j<3 ;j++ ){
				System.out.printf("%5d",a[i][j]); // �� �࿡ 5�����̾ 5ĭ
			}
			System.out.println(); // �� ���� ������ �� �ٲٱ�
		}
		
	}
}

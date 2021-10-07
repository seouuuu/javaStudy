class ThreeDimensionArray
{
	public static void main(String[] args) 
	{
		int [][][]a = new int[2][3][4];
		for (int i=0 ;i<2 ;i++ ){
			for (int j=0;j<3 ;j++ ){
				for (int k=0;k<4 ;k++ ){
					a[i][j][k] = i+1;
				}
			}
		}
		for ( int i=0;i<2 ;i++ ){
			for (int j=0;j<3 ;j++ ){
				for (int k=0;k<4 ;k++ ){
					System.out.printf("%5d",a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

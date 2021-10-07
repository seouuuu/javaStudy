class Matrix3 
{
	public static void main(String[] args) 
	{
		int [][][]a = new int[2][3][4];
		for (int i=0;i<2 ;i++ ){
			for (int j=0;j<3 ;j++ ){
				for (int k=0;k<4 ;k++ ){
					if (i ==0){
						a[i][j][k] = 1;
					} else
						a[i][j][k] = 2;
				}
			}
		}
		for (int i=0;i<2 ;i++ ){
			for (int j=0;j<3 ;j++ ){
				for (int k=0;k<4 ;k++ ){
					System.out.printf("%2d",a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}

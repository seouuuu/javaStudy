class PrintMultiplicationTableWhile 
{
	public static void main(String[] args) 
	{
		int dan =2;
		while (dan<=9){
			System.out.printf("**%d단**\n",dan);//형식지정 printf  줄바꿈\n
			int i=1;
			while (i<=9){
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				i++;
			}
			dan++;
			System.out.println();
		}
	}
}

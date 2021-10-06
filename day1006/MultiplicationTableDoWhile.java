class MultiplicationTableDoWhile 
{
	public static void main(String[] args) 
	{
		int dan,i;
		dan =2;
		do{
			System.out.printf("**%d´Ü**\n",dan);
			i=1;
			do{
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				i++;
			} while (i<=9);
	       System.out.println();
		   dan++;
		  }while (dan<=9);
	}
}

class BitTest 
{
	public static void main(String[] args) 
	{
		int a  =10; // 00001010 int여서 32개 만들어야 하지만 8개로 설명
		int b = 20; // 00010100
		int i = a  & b;
		int j = a | b;
		int k = a ^ b;

		System.out.println("i="+i); // 00000000 //0
		System.out.println("j="+j); //00011110  //30
		System.out.println("k="+k); //00011110 //30
	}
}

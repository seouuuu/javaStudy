class ForEachTest 
{
	public static void main(String[] args) 
	{
		String []name ={"갑","을","병","정","무","기"};
		/*
		for ( String data : name ){
			System.out.println(data);
		}
		*/

		for (int i=0; i<name.length ; i++ ){
			System.out.println(name[i]);
		}
	}
}

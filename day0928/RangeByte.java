class RangeByte 
{
	public static void main(String[] args) 
	{
		byte data;
		data = -128;
		System.out.println(data);
		data = (byte)(data - 1);//underFlow
		System.out.println(data);

		/*data = 127;
		System.out.println(data);
		data = (byte)(data+1); // overFlow
		data 
		System.out.println(data);
		*/
	}
}

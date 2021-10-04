class StudentTest 
{
	public static void main(String[] args) 
	{
		String []name = {"°©","À»","º´","Á¤","¹«"};
		int []age = {27,28,26,29,28};
		int tot = 0;
		for (int i=0;i<name.length ;  i++ ){
			System.out.println(name[i]+":"+age[i]);
			tot += age[i];
		}
		double avg = (double) tot/ age.length;
		System.out.println("Æò±Õ³ªÀÌ:" + avg);
	}
}

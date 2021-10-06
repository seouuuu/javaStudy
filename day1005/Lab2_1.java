import java.io.IOException;
class Lab2_1
{
	public static void main(String[] args) throws IOException
	{
		String s;
		System.out.printf("문자를 입력하시오");
		char c = (char) System.in.read();
		if (c =='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	    	System.out.printf("입력된 문자%c은 모음입니다.",c);
		}
	}
}

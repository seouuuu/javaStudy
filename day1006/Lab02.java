import java.io.IOException;
class Lab02 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("문자를 입력하시오: ");
		char c =(char)System.in.read();
		switch (c){
			case 'a': case 'e': case 'i': case 'o': case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
				System.out.printf("입력된 문자%c는 모음입니다.",c);
				break;
			default:
				System.out.println("입력된 문자는 모음이 아닙니다.");

			}
		
			/*
			if (c=='a'){
				System.out.printf("입력된 문자%c는 모음입니다.",c);
			*/
			}
	}

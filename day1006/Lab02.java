import java.io.IOException;
class Lab02 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		char c =(char)System.in.read();
		switch (c){
			case 'a': case 'e': case 'i': case 'o': case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
				System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);
				break;
			default:
				System.out.println("�Էµ� ���ڴ� ������ �ƴմϴ�.");

			}
		
			/*
			if (c=='a'){
				System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);
			*/
			}
	}

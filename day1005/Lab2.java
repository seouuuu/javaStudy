import java.io.IOException;
class Lab2 
{
	public static void main(String[] args) throws IOException
	{
		String s;
		System.out.printf("���ڸ� �Է��Ͻÿ�");
		char c = (char) System.in.read();
	    switch(c){
				case 'a': System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
				case 'A': System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
				case 'e': System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
				case 'E': System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
				case 'i':  System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
		        case 'I':  System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
				case 'o': System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
			    case 'O': System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
				case 'u': System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
			    case 'U': System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);break;
			    default : System.out.printf("�Էµ� ���ڴ� ������ �ƴմϴ�.");
		}
	}
}

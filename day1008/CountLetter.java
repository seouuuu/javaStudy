import java.util.Scanner;
class CountLetter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []count = new int[26]; 

		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		String buffer = sc.nextLine();
		System.out.println(buffer);
		for (int i=0;i<buffer.length();i++ ){ 
			char ch = buffer.charAt(i);
			if (ch !=' '){
				if (ch>= 'A' && ch<='Z'){
					ch = (char)(ch +32); // char�� ��ȯ�ؾ���
				}
				count[ch-'a']++;
			}
		}
		for (int i=0; i<count.length ;i++ ){
			System.out.printf("%10c: %5d\n",(char)(i+'a'),count[i]);
		}
	}
}

import java.util.Scanner;
class LengthOfVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		int cnt=0;
		char c;
		System.out.print("���ڿ��� �Է��ϼ���==>");
		data = sc.next();
		for (int i =0; i<data.length() ;i++ ){
			c = data.charAt(i);
			if ( c=='a' ||c=='A' ||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
				cnt++;
			}//end if
		}//end for
		System.out.println("������ ���� "+cnt+"�� �Դϴ�.");
		//System.out.printf("������ ���� %d���Դϴ�.",cnt);
	}
}

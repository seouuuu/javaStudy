import java.util.Scanner;
class VowCnt
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.print("문자열을 입력하세요==>");
		data = sc.next();
		int i,sum=0;
		for (i=0 ;i<data.length() ;i++ ){
			switch (  data.charAt(i) ){
			case 'a':case 'e':case 'i':case 'o':case 'u':
			case 'A':case 'E':case 'I':case 'O':case 'U':
		    sum++;
			break;	
			}
		}
		System.out.println(data +"의 모음의 개수: "+sum);
	}
}

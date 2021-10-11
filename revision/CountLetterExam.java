import java.util.Scanner;
class CountLetterExam 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []count = new int[26];
		System.out.print("문자열 입력==>");
		String data = sc.nextLine();
		System.out.println(data);
		for ( int i=0;i<data.length() ;i++ ){
			char ch = data.charAt(i);
			if (ch != ' '){
				count[ch-'a']++;
			}
		}
		for (int i=0;i<count.length ; i++){
			System.out.printf("%10c:%5d\n",(char)(i+'a'),count[i]);
		}
	}
}

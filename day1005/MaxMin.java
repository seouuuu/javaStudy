import java.util.Scanner;
class  MaxMin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []name = new String[10];
		int []user = new int[10];
		int max,min;
		for (int i = 0; i<user.length ; i++ )
		{ System.out.print((i+1)+"번 학생의 이름을 입력하세요==>");
		  name[i] = sc.next();
		 System.out.print((i+1)+"번 학생의 점수를 입력하세요==>");
		  user[i] =sc.nextInt();
		}
		max = user[0];
		for (int i=1 ; i<user.length ; i++){
			if (max<user[i] ){
				max = user[i];
			}
		}
		min = user[0];
		for (int i=1 ; i<user.length ; i++){
			if (min >user[i] ){
				min = user[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
}

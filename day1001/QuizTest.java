import java.util.Scanner;
class  QuizTest
{
	public static void main(String[] args) 
	{
		int []quiz = {1,2,3,4,5,6,7,8,9,10};
		int []answer = {3,4,1,3,2,4,1,3,3,1};
		int []user = new int[10];
		int sum=0,sum2=0;
		Scanner sc = new Scanner(System.in);
		for( int i=0 ; i<user.length  ;i++ ){
			System.out.print((i+1) + "번의 정답을 입력하세요==>");
			user[i] = sc.nextInt();
		}
		for ( int i=0  ;  i <answer.length ; i++ ){
			if (answer[i] == user[i]){
				System.out.println((i+1)+"   O");
				sum = sum+1;
			} else{
				System.out.println((i+1)+"   X");
				sum2=sum2+1;
				}
		}
		System.out.println("정답수 : " + sum +"개");
		System.out.println("오답수 : " + sum2 +"개");
	}
}

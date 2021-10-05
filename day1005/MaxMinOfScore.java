import java.util.Scanner;
class MaxMinOfScore 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []score = new int[10];
		for ( int i=0 ; i<score.length  ; i++ ){
			System.out.print((i+1)+"번째 학생의 점수를 입력하세요==>");
			score[i] = sc.nextInt();
		}
		int max,min;
		max = score[0];
		min = score[0];
		for (  int i =1; i<score.length ; i++){
			if (score[i]>max){
				max = score[i];
			}
			if (score[i]< min){
				min = score[i];
			}
		}
	}
}

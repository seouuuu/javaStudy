import java.util.Scanner;

class MyUtil
{
	int correctAnswers(char []answer,char []student_answer){
		int cnt =0;
		for (int i=0;i<answer.length ;i++ ){
			if (answer[i]==student_answer[i]){
				cnt++;
			}
		}
		return cnt;
	} 

	int incorrectAnswers(char []answer,char []student_answer){
		return 10 - correctAnswers(answer, student_answer);
	}	
	boolean isPassed(char []answer,char []student_answer){
		return correctAnswers(answer, student_answer)>=7;
	}
}


class  Exam
{
	public static void main(String[] args) 
	{
		String []question = {
			"���ѹα��� ������?",
			"�̱��� ������?",
			"������ ������",
			"������� ������",
			"�������� ������",
			"�̰������� ������",
			"������ ������",
			"�ε��� ������",
			"ĳ������ ������",
			"��Ű�� ������"};
		String []view = {
		"a.������   b.����   c.����ư�   d.�߷�",
		"a.������   b.����   c.����ư�   d.�߷�",
		"a.������   b.����   c.����   d.�߷�",
		"a.������   b.����   c.����ư�   d.���������",
		"a.����       b.����   c.����   d.�߷�",
		"a.������   b.�̰�����   c.����   d.�߷�",
		"a.������   b.����   c.����   d.�߷�",
		"a.������   b.����   c.����   d.�߷�",
		"a.������   b.����   c.��Ÿ��   d.�߷�",
		"a.��ī��   b.����   c.����   d.�߷�"};
		char []answer ={'b','a','c','d','a','b','b','a','c','a'};
		char []student_answer = new char[10];

		Scanner sc =new Scanner(System.in);
		for (int i=0; i<question.length;i++ ){
			System.out.println(question[i]);
			System.out.print(view[i]+"==>");
			student_answer[i] = sc.next().charAt(0);
		}
		MyUtil util = new MyUtil();
		int cnt =util.correctAnswers(answer,student_answer);
		
		System.out.println("**���� ���**");
		System.out.printf("�����: %d\n",cnt);
		System.out.printf("Ʋ�����: %d\n",util.incorrectAnswers(answer,student_answer));
		if (util.isPassed(answer,student_answer)){
			System.out.printf("�հݿ���: %s\n","�հ�");
		}else{
			System.out.printf("�հݿ���: %s\n","���հ�");
		}
	}
}
